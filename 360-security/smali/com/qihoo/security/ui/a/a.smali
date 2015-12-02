.class public Lcom/qihoo/security/ui/a/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/a/a$1;,
        Lcom/qihoo/security/ui/a/a$a;,
        Lcom/qihoo/security/ui/a/a$b;
    }
.end annotation


# instance fields
.field private final a:Z

.field private b:Landroid/content/Context;

.field private c:Landroid/view/LayoutInflater;

.field private d:Landroid/content/pm/PackageManager;

.field private e:Landroid/widget/LinearLayout;

.field private f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/content/pm/PermissionInfo;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/lang/String;

.field private final j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Lcom/qihoo/security/ui/a/a$b;

.field private m:Landroid/widget/LinearLayout;

.field private n:Landroid/widget/LinearLayout;

.field private o:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation
.end field

.field private p:Landroid/view/View;

.field private final q:Lcom/qihoo/security/locale/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/pm/PackageParser$Package;)V
    .locals 4

    .prologue
    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/a/a;->a:Z

    .line 74
    const-string/jumbo v0, "DefaultGrp"

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->j:Ljava/lang/String;

    .line 82
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->q:Lcom/qihoo/security/locale/d;

    .line 112
    iput-object p1, p0, Lcom/qihoo/security/ui/a/a;->b:Landroid/content/Context;

    .line 113
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->d:Landroid/content/pm/PackageManager;

    .line 114
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->h:Ljava/util/List;

    .line 115
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 116
    if-nez p2, :cond_1

    .line 141
    :cond_0
    return-void

    .line 120
    :cond_1
    iget-object v0, p2, Landroid/content/pm/PackageParser$Package;->requestedPermissions:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 121
    iget-object v0, p2, Landroid/content/pm/PackageParser$Package;->requestedPermissions:Ljava/util/ArrayList;

    .line 122
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 123
    if-lez v2, :cond_2

    .line 124
    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/ui/a/a;->a([Ljava/lang/String;Ljava/util/Set;)V

    .line 128
    :cond_2
    iget-object v0, p2, Landroid/content/pm/PackageParser$Package;->mSharedUserId:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 131
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->d:Landroid/content/pm/PackageManager;

    iget-object v2, p2, Landroid/content/pm/PackageParser$Package;->mSharedUserId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->getUidForSharedUser(Ljava/lang/String;)I

    move-result v0

    .line 132
    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/ui/a/a;->a(ILjava/util/Set;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    :cond_3
    :goto_0
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PermissionInfo;

    .line 139
    iget-object v2, p0, Lcom/qihoo/security/ui/a/a;->h:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 133
    :catch_0
    move-exception v0

    .line 134
    const-string/jumbo v0, "AppSecurityPermissions"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Could\'nt retrieve shared user id for:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p2, Landroid/content/pm/PackageParser$Package;->packageName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/ui/a/a;->a:Z

    .line 74
    const-string/jumbo v0, "DefaultGrp"

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->j:Ljava/lang/String;

    .line 82
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->q:Lcom/qihoo/security/locale/d;

    .line 91
    iput-object p1, p0, Lcom/qihoo/security/ui/a/a;->b:Landroid/content/Context;

    .line 92
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->d:Landroid/content/pm/PackageManager;

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->h:Ljava/util/List;

    .line 94
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 97
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/ui/a/a;->d:Landroid/content/pm/PackageManager;

    const/16 v2, 0x1000

    invoke-virtual {v1, p2, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 103
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v2, :cond_0

    iget-object v2, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v2, v2, Landroid/content/pm/ApplicationInfo;->uid:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    .line 104
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->uid:I

    invoke-direct {p0, v1, v0}, Lcom/qihoo/security/ui/a/a;->a(ILjava/util/Set;)V

    .line 106
    :cond_0
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PermissionInfo;

    .line 107
    iget-object v2, p0, Lcom/qihoo/security/ui/a/a;->h:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 98
    :catch_0
    move-exception v0

    .line 99
    const-string/jumbo v0, "AppSecurityPermissions"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Could\'nt retrieve permissions for package:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    :cond_1
    return-void
.end method

.method private static a(Landroid/content/Context;Landroid/view/LayoutInflater;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Landroid/view/View;
    .locals 3

    .prologue
    .line 358
    const v0, 0x7f03002c

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 360
    const v0, 0x7f0b0095

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 361
    const v1, 0x7f0b0096

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 363
    if-eqz p2, :cond_0

    .line 364
    invoke-virtual {v0, p2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 365
    invoke-virtual {v1, p3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 370
    :goto_0
    return-object v2

    .line 367
    :cond_0
    invoke-virtual {v0, p3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 368
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_0
.end method

.method private a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Landroid/view/View;
    .locals 2

    .prologue
    .line 353
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/ui/a/a;->c:Landroid/view/LayoutInflater;

    invoke-static {v0, v1, p1, p2, p3}, Lcom/qihoo/security/ui/a/a;->a(Landroid/content/Context;Landroid/view/LayoutInflater;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 274
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    .line 275
    :cond_0
    const/4 p1, 0x0

    .line 282
    :cond_1
    :goto_0
    return-object p1

    .line 278
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 279
    add-int/lit8 v1, v0, -0x1

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2e

    if-ne v1, v2, :cond_1

    .line 280
    const/4 v1, 0x0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 292
    if-nez p1, :cond_2

    .line 293
    if-nez p2, :cond_1

    .line 294
    const/4 v0, 0x0

    .line 303
    :cond_0
    :goto_0
    return-object v0

    .line 296
    :cond_1
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 298
    :cond_2
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 299
    if-eqz p2, :cond_0

    .line 303
    iget-object v1, p0, Lcom/qihoo/security/ui/a/a;->k:Ljava/lang/String;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a(ILjava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Set",
            "<",
            "Landroid/content/pm/PermissionInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 153
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->d:Landroid/content/pm/PackageManager;

    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v1

    .line 154
    if-eqz v1, :cond_0

    array-length v0, v1

    if-nez v0, :cond_1

    .line 160
    :cond_0
    return-void

    .line 157
    :cond_1
    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 158
    invoke-direct {p0, v3, p2}, Lcom/qihoo/security/ui/a/a;->a(Ljava/lang/String;Ljava/util/Set;)V

    .line 157
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Landroid/content/pm/PermissionInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 165
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->d:Landroid/content/pm/PackageManager;

    const/16 v1, 0x1000

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 170
    if-eqz v0, :cond_0

    iget-object v1, v0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 171
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    invoke-direct {p0, v0, p2}, Lcom/qihoo/security/ui/a/a;->a([Ljava/lang/String;Ljava/util/Set;)V

    .line 173
    :cond_0
    :goto_0
    return-void

    .line 166
    :catch_0
    move-exception v0

    .line 167
    const-string/jumbo v0, "AppSecurityPermissions"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Could\'nt retrieve permissions for package:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private a(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/content/pm/PermissionInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 456
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->o:Ljava/util/HashMap;

    .line 458
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->o:Ljava/util/HashMap;

    const-string/jumbo v1, "DefaultGrp"

    iget-object v2, p0, Lcom/qihoo/security/ui/a/a;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->f:Ljava/util/Map;

    .line 465
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->g:Ljava/util/Map;

    .line 469
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 470
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 471
    new-instance v6, Lcom/qihoo/security/ui/a/a$a;

    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->d:Landroid/content/pm/PackageManager;

    invoke-direct {v6, v0}, Lcom/qihoo/security/ui/a/a$a;-><init>(Landroid/content/pm/PackageManager;)V

    .line 473
    if-eqz p1, :cond_5

    .line 475
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PermissionInfo;

    .line 479
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/a/a;->a(Landroid/content/pm/PermissionInfo;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 485
    iget v1, v0, Landroid/content/pm/PermissionInfo;->protectionLevel:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    move-object v2, v3

    .line 487
    :goto_1
    iget-object v1, v0, Landroid/content/pm/PermissionInfo;->group:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string/jumbo v1, "DefaultGrp"

    move-object v5, v1

    .line 491
    :goto_2
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 492
    if-nez v1, :cond_3

    .line 493
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 494
    invoke-interface {v2, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-object v2, v4

    .line 485
    goto :goto_1

    .line 487
    :cond_2
    iget-object v1, v0, Landroid/content/pm/PermissionInfo;->group:Ljava/lang/String;

    move-object v5, v1

    goto :goto_2

    .line 497
    :cond_3
    invoke-static {v1, v0, v6}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result v2

    .line 501
    if-gez v2, :cond_0

    .line 502
    neg-int v2, v2

    add-int/lit8 v2, v2, -0x1

    .line 503
    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_0

    .line 509
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->f:Ljava/util/Map;

    invoke-direct {p0, v3, v0}, Lcom/qihoo/security/ui/a/a;->a(Ljava/util/Map;Ljava/util/Map;)V

    .line 510
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->g:Ljava/util/Map;

    invoke-direct {p0, v4, v0}, Lcom/qihoo/security/ui/a/a;->a(Ljava/util/Map;Ljava/util/Map;)V

    .line 513
    :cond_5
    sget-object v0, Lcom/qihoo/security/ui/a/a$b;->a:Lcom/qihoo/security/ui/a/a$b;

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->l:Lcom/qihoo/security/ui/a/a$b;

    .line 514
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 515
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_7

    sget-object v0, Lcom/qihoo/security/ui/a/a$b;->d:Lcom/qihoo/security/ui/a/a$b;

    :goto_3
    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->l:Lcom/qihoo/security/ui/a/a$b;

    .line 522
    :cond_6
    :goto_4
    invoke-direct {p0}, Lcom/qihoo/security/ui/a/a;->d()V

    .line 523
    return-void

    .line 515
    :cond_7
    sget-object v0, Lcom/qihoo/security/ui/a/a$b;->b:Lcom/qihoo/security/ui/a/a$b;

    goto :goto_3

    .line 516
    :cond_8
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 517
    sget-object v0, Lcom/qihoo/security/ui/a/a$b;->c:Lcom/qihoo/security/ui/a/a$b;

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->l:Lcom/qihoo/security/ui/a/a$b;

    goto :goto_4
.end method

.method private a(Ljava/util/Map;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Landroid/content/pm/PermissionInfo;",
            ">;>;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 410
    if-nez p1, :cond_1

    .line 437
    :cond_0
    return-void

    .line 413
    :cond_1
    if-eqz p2, :cond_0

    .line 416
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 417
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 418
    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 419
    const/4 v2, 0x0

    .line 420
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 421
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 422
    if-eqz v1, :cond_2

    .line 425
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/PermissionInfo;

    .line 426
    iget-object v5, p0, Lcom/qihoo/security/ui/a/a;->d:Landroid/content/pm/PackageManager;

    invoke-virtual {v1, v5}, Landroid/content/pm/PermissionInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 427
    invoke-direct {p0, v2, v1}, Lcom/qihoo/security/ui/a/a;->a(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    .line 428
    goto :goto_1

    .line 430
    :cond_3
    if-eqz v2, :cond_2

    .line 434
    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method private a(Z)V
    .locals 5

    .prologue
    .line 332
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->f:Ljava/util/Map;

    move-object v2, v0

    .line 333
    :goto_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->n:Landroid/widget/LinearLayout;

    move-object v1, v0

    .line 334
    :goto_1
    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 336
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 337
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 338
    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/a/a;->b(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v4

    .line 344
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-direct {p0, v4, v0, p1}, Lcom/qihoo/security/ui/a/a;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_2

    .line 332
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->g:Ljava/util/Map;

    move-object v2, v0

    goto :goto_0

    .line 333
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->m:Landroid/widget/LinearLayout;

    move-object v1, v0

    goto :goto_1

    .line 346
    :cond_2
    return-void
.end method

.method private a([Ljava/lang/String;Ljava/util/Set;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Landroid/content/pm/PermissionInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 176
    if-eqz p1, :cond_0

    array-length v1, p1

    if-nez v1, :cond_1

    .line 189
    :cond_0
    return-void

    .line 179
    :cond_1
    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_0

    aget-object v2, p1, v0

    .line 181
    :try_start_0
    iget-object v3, p0, Lcom/qihoo/security/ui/a/a;->d:Landroid/content/pm/PackageManager;

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v4}, Landroid/content/pm/PackageManager;->getPermissionInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionInfo;

    move-result-object v3

    .line 182
    if-eqz v3, :cond_2

    .line 183
    invoke-interface {p2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 179
    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 185
    :catch_0
    move-exception v3

    .line 186
    const-string/jumbo v3, "AppSecurityPermissions"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "Ignoring unknown permission:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method

.method private a(Landroid/content/pm/PermissionInfo;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 397
    iget v1, p1, Landroid/content/pm/PermissionInfo;->protectionLevel:I

    if-eq v1, v0, :cond_0

    iget v1, p1, Landroid/content/pm/PermissionInfo;->protectionLevel:I

    if-nez v1, :cond_1

    .line 401
    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 3

    .prologue
    .line 307
    if-nez p1, :cond_1

    .line 309
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->i:Ljava/lang/String;

    .line 324
    :cond_0
    :goto_0
    return-object v0

    .line 311
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->o:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    .line 312
    if-nez v0, :cond_0

    .line 317
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->d:Landroid/content/pm/PackageManager;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPermissionGroupInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionGroupInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 322
    iget-object v1, p0, Lcom/qihoo/security/ui/a/a;->d:Landroid/content/pm/PackageManager;

    invoke-virtual {v0, v1}, Landroid/content/pm/PermissionGroupInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 323
    iget-object v1, p0, Lcom/qihoo/security/ui/a/a;->o:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 318
    :catch_0
    move-exception v0

    .line 319
    const-string/jumbo v0, "AppSecurityPermissions"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Invalid group name:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 320
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c()V
    .locals 2

    .prologue
    .line 349
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->p:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 350
    return-void
.end method

.method private d()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 375
    sget-object v0, Lcom/qihoo/security/ui/a/a$1;->a:[I

    iget-object v1, p0, Lcom/qihoo/security/ui/a/a;->l:Lcom/qihoo/security/ui/a/a$b;

    invoke-virtual {v1}, Lcom/qihoo/security/ui/a/a$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 394
    :goto_0
    return-void

    .line 377
    :pswitch_0
    invoke-direct {p0}, Lcom/qihoo/security/ui/a/a;->c()V

    goto :goto_0

    .line 381
    :pswitch_1
    invoke-direct {p0, v3}, Lcom/qihoo/security/ui/a/a;->a(Z)V

    goto :goto_0

    .line 385
    :pswitch_2
    invoke-direct {p0, v2}, Lcom/qihoo/security/ui/a/a;->a(Z)V

    goto :goto_0

    .line 389
    :pswitch_3
    invoke-direct {p0, v3}, Lcom/qihoo/security/ui/a/a;->a(Z)V

    .line 390
    invoke-direct {p0, v2}, Lcom/qihoo/security/ui/a/a;->a(Z)V

    .line 391
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 375
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public b()Landroid/view/View;
    .locals 3

    .prologue
    .line 253
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->c:Landroid/view/LayoutInflater;

    .line 254
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->c:Landroid/view/LayoutInflater;

    const v1, 0x7f03002d

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->e:Landroid/widget/LinearLayout;

    .line 255
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->e:Landroid/widget/LinearLayout;

    const v1, 0x7f0b0098

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->n:Landroid/widget/LinearLayout;

    .line 256
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->e:Landroid/widget/LinearLayout;

    const v1, 0x7f0b0099

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->m:Landroid/widget/LinearLayout;

    .line 257
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->e:Landroid/widget/LinearLayout;

    const v1, 0x7f0b0097

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->p:Landroid/view/View;

    .line 260
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->q:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c00f7

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->i:Ljava/lang/String;

    .line 261
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->q:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c00f6

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/a/a;->k:Ljava/lang/String;

    .line 264
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->h:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/qihoo/security/ui/a/a;->a(Ljava/util/List;)V

    .line 265
    iget-object v0, p0, Lcom/qihoo/security/ui/a/a;->e:Landroid/widget/LinearLayout;

    return-object v0
.end method
