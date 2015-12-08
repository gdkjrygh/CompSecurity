.class public final Lcrittercism/android/bw$h;
.super Ljava/lang/Object;

# interfaces
.implements Lcrittercism/android/bv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcrittercism/android/bw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field private a:Ljava/lang/Float;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 206
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 204
    const/4 v0, 0x0

    iput-object v0, p0, Lcrittercism/android/bw$h;->a:Ljava/lang/Float;

    .line 207
    invoke-static {}, Lcrittercism/android/bw;->b()Landroid/content/Context;

    .line 208
    invoke-static {}, Lcrittercism/android/bw;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcrittercism/android/bw$h;->a:Ljava/lang/Float;

    .line 209
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 212
    const-string v0, "dpi"

    return-object v0
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 203
    iget-object v0, p0, Lcrittercism/android/bw$h;->a:Ljava/lang/Float;

    return-object v0
.end method
