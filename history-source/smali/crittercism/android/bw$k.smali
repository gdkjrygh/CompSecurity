.class public final Lcrittercism/android/bw$k;
.super Ljava/lang/Object;

# interfaces
.implements Lcrittercism/android/bv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcrittercism/android/bw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "k"
.end annotation


# instance fields
.field public a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 257
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 255
    const/4 v0, 0x0

    iput-object v0, p0, Lcrittercism/android/bw$k;->a:Ljava/lang/String;

    .line 258
    invoke-static {}, Lcrittercism/android/bw;->b()Landroid/content/Context;

    .line 259
    invoke-static {}, Lcrittercism/android/bw;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcrittercism/android/bw$k;->a:Ljava/lang/String;

    .line 260
    iget-object v0, p0, Lcrittercism/android/bw$k;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcrittercism/android/bw$k;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 261
    :cond_0
    const-string v0, "en"

    iput-object v0, p0, Lcrittercism/android/bw$k;->a:Ljava/lang/String;

    .line 263
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 266
    const-string v0, "locale"

    return-object v0
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 254
    iget-object v0, p0, Lcrittercism/android/bw$k;->a:Ljava/lang/String;

    return-object v0
.end method
