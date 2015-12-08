.class public Lcom/mopub/common/util/ManifestUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation
.end field

.field private static b:Lcom/mopub/common/util/c;

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 29
    new-instance v0, Lcom/mopub/common/util/c;

    invoke-direct {v0}, Lcom/mopub/common/util/c;-><init>()V

    sput-object v0, Lcom/mopub/common/util/ManifestUtils;->b:Lcom/mopub/common/util/c;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    sput-object v0, Lcom/mopub/common/util/ManifestUtils;->a:Ljava/util/List;

    const-class v1, Lcom/mopub/mobileads/MoPubActivity;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->a:Ljava/util/List;

    const-class v1, Lcom/mopub/mobileads/MraidActivity;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->a:Ljava/util/List;

    const-class v1, Lcom/mopub/mobileads/MraidVideoPlayerActivity;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->a:Ljava/util/List;

    const-class v1, Lcom/mopub/common/MoPubBrowser;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    sput-object v0, Lcom/mopub/common/util/ManifestUtils;->c:Ljava/util/List;

    const-class v1, Lcom/mopub/common/MoPubBrowser;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/Class;)Lcom/mopub/common/util/b;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class",
            "<+",
            "Landroid/app/Activity;",
            ">;)",
            "Lcom/mopub/common/util/b;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 218
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    new-instance v1, Landroid/content/ComponentName;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v3}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v0

    .line 221
    new-instance v1, Lcom/mopub/common/util/b;

    invoke-direct {v1, v3}, Lcom/mopub/common/util/b;-><init>(B)V

    .line 222
    sget-object v2, Lcom/mopub/common/util/ManifestUtils;->b:Lcom/mopub/common/util/c;

    iget v3, v0, Landroid/content/pm/ActivityInfo;->configChanges:I

    const/16 v4, 0x20

    invoke-virtual {v2, p1, v3, v4}, Lcom/mopub/common/util/c;->hasFlag(Ljava/lang/Class;II)Z

    move-result v2

    iput-boolean v2, v1, Lcom/mopub/common/util/b;->hasKeyboardHidden:Z

    .line 223
    sget-object v2, Lcom/mopub/common/util/ManifestUtils;->b:Lcom/mopub/common/util/c;

    iget v3, v0, Landroid/content/pm/ActivityInfo;->configChanges:I

    const/16 v4, 0x80

    invoke-virtual {v2, p1, v3, v4}, Lcom/mopub/common/util/c;->hasFlag(Ljava/lang/Class;II)Z

    move-result v2

    iput-boolean v2, v1, Lcom/mopub/common/util/b;->hasOrientation:Z

    .line 224
    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/mopub/common/util/b;->hasScreenSize:Z

    .line 228
    invoke-static {}, Lcom/mopub/common/util/VersionCode;->currentApiLevel()Lcom/mopub/common/util/VersionCode;

    move-result-object v2

    sget-object v3, Lcom/mopub/common/util/VersionCode;->HONEYCOMB_MR2:Lcom/mopub/common/util/VersionCode;

    invoke-virtual {v2, v3}, Lcom/mopub/common/util/VersionCode;->isAtLeast(Lcom/mopub/common/util/VersionCode;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget v2, v2, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    sget-object v3, Lcom/mopub/common/util/VersionCode;->HONEYCOMB_MR2:Lcom/mopub/common/util/VersionCode;

    invoke-virtual {v3}, Lcom/mopub/common/util/VersionCode;->getApiLevel()I

    move-result v3

    if-lt v2, v3, :cond_0

    .line 230
    sget-object v2, Lcom/mopub/common/util/ManifestUtils;->b:Lcom/mopub/common/util/c;

    iget v0, v0, Landroid/content/pm/ActivityInfo;->configChanges:I

    const/16 v3, 0x400

    invoke-virtual {v2, p1, v0, v3}, Lcom/mopub/common/util/c;->hasFlag(Ljava/lang/Class;II)Z

    move-result v0

    iput-boolean v0, v1, Lcom/mopub/common/util/b;->hasScreenSize:Z

    .line 233
    :cond_0
    return-object v1
.end method

.method private static a(Landroid/content/Context;Ljava/util/List;Z)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Landroid/app/Activity;",
            ">;>;Z)",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 134
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 137
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 138
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 140
    invoke-static {p0, v3}, Lcom/mopub/common/util/Intents;->deviceCanHandleIntent(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v3

    if-ne v3, p2, :cond_0

    .line 141
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 145
    :cond_1
    return-object v1
.end method

.method private static a(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 238
    invoke-static {p0}, Lcom/mopub/common/util/ManifestUtils;->isDebuggable(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 241
    const-string v0, "ERROR: YOUR MOPUB INTEGRATION IS INCOMPLETE.\nCheck logcat and update your AndroidManifest.xml with the correct activities and configuration."

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 242
    const/4 v1, 0x7

    invoke-virtual {v0, v1, v2, v2}, Landroid/widget/Toast;->setGravity(III)V

    .line 243
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 245
    :cond_0
    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/util/List;)V
    .locals 4
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Landroid/app/Activity;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 79
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/mopub/common/util/ManifestUtils;->a(Landroid/content/Context;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v0

    .line 82
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 90
    :goto_0
    return-void

    .line 86
    :cond_0
    invoke-static {p0}, Lcom/mopub/common/util/ManifestUtils;->a(Landroid/content/Context;)V

    .line 1171
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AndroidManifest permissions for the following required MoPub activities are missing:\n"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1174
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 1175
    const-string v3, "\n\t"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 1177
    :cond_1
    const-string v0, "\n\nPlease update your manifest to include them."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1179
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->w(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private static b(Landroid/content/Context;Ljava/util/List;)V
    .locals 6
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Landroid/app/Activity;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 102
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lcom/mopub/common/util/ManifestUtils;->a(Landroid/content/Context;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v0

    .line 104
    invoke-static {p0, v0}, Lcom/mopub/common/util/ManifestUtils;->c(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 107
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 115
    :goto_0
    return-void

    .line 111
    :cond_0
    invoke-static {p0}, Lcom/mopub/common/util/ManifestUtils;->a(Landroid/content/Context;)V

    .line 1184
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "In AndroidManifest, the android:configChanges param is missing values for the following MoPub activities:\n"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1187
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 1191
    :try_start_0
    invoke-static {p0, v0}, Lcom/mopub/common/util/ManifestUtils;->a(Landroid/content/Context;Ljava/lang/Class;)Lcom/mopub/common/util/b;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 1196
    iget-boolean v4, v3, Lcom/mopub/common/util/b;->hasKeyboardHidden:Z

    if-nez v4, :cond_2

    .line 1197
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "\n\tThe android:configChanges param for activity "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " must include keyboardHidden."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1199
    :cond_2
    iget-boolean v4, v3, Lcom/mopub/common/util/b;->hasOrientation:Z

    if-nez v4, :cond_3

    .line 1200
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "\n\tThe android:configChanges param for activity "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " must include orientation."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1202
    :cond_3
    iget-boolean v3, v3, Lcom/mopub/common/util/b;->hasScreenSize:Z

    if-nez v3, :cond_1

    .line 1203
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\n\tThe android:configChanges param for activity "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " must include screenSize."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 1207
    :cond_4
    const-string v0, "\n\nPlease update your manifest to include them."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1209
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->w(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1193
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private static c(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0xd
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Landroid/app/Activity;",
            ">;>;)",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 151
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 154
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 157
    :try_start_0
    invoke-static {p0, v0}, Lcom/mopub/common/util/ManifestUtils;->a(Landroid/content/Context;Ljava/lang/Class;)Lcom/mopub/common/util/b;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 162
    iget-boolean v4, v3, Lcom/mopub/common/util/b;->hasKeyboardHidden:Z

    if-eqz v4, :cond_1

    iget-boolean v4, v3, Lcom/mopub/common/util/b;->hasOrientation:Z

    if-eqz v4, :cond_1

    iget-boolean v3, v3, Lcom/mopub/common/util/b;->hasScreenSize:Z

    if-nez v3, :cond_0

    .line 163
    :cond_1
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 159
    :catch_0
    move-exception v0

    goto :goto_0

    .line 167
    :cond_2
    return-object v1
.end method

.method public static checkNativeActivitiesDeclared(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 61
    const-string v0, "context is not allowed to be null"

    invoke-static {p0, v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 67
    :goto_0
    return-void

    .line 65
    :cond_0
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->c:Ljava/util/List;

    invoke-static {p0, v0}, Lcom/mopub/common/util/ManifestUtils;->a(Landroid/content/Context;Ljava/util/List;)V

    .line 66
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->c:Ljava/util/List;

    invoke-static {p0, v0}, Lcom/mopub/common/util/ManifestUtils;->b(Landroid/content/Context;Ljava/util/List;)V

    goto :goto_0
.end method

.method public static checkWebViewActivitiesDeclared(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 52
    const-string v0, "context is not allowed to be null"

    invoke-static {p0, v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 58
    :goto_0
    return-void

    .line 56
    :cond_0
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->a:Ljava/util/List;

    invoke-static {p0, v0}, Lcom/mopub/common/util/ManifestUtils;->a(Landroid/content/Context;Ljava/util/List;)V

    .line 57
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->a:Ljava/util/List;

    invoke-static {p0, v0}, Lcom/mopub/common/util/ManifestUtils;->b(Landroid/content/Context;Ljava/util/List;)V

    goto :goto_0
.end method

.method public static isDebuggable(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 118
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 119
    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/mopub/common/util/Utils;->bitMaskContainsFlag(II)Z

    move-result v0

    return v0
.end method
