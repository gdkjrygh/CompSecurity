.class public Landroid/support/v4/view/ad;
.super Ljava/lang/Object;
.source "ViewCompat.java"


# static fields
.field static final a:Landroid/support/v4/view/aj;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 231
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 232
    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    const-string v2, "JellyBean"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 233
    :cond_0
    new-instance v0, Landroid/support/v4/view/ai;

    invoke-direct {v0}, Landroid/support/v4/view/ai;-><init>()V

    sput-object v0, Landroid/support/v4/view/ad;->a:Landroid/support/v4/view/aj;

    .line 243
    :goto_0
    return-void

    .line 234
    :cond_1
    const/16 v1, 0xe

    if-lt v0, v1, :cond_2

    .line 235
    new-instance v0, Landroid/support/v4/view/ah;

    invoke-direct {v0}, Landroid/support/v4/view/ah;-><init>()V

    sput-object v0, Landroid/support/v4/view/ad;->a:Landroid/support/v4/view/aj;

    goto :goto_0

    .line 236
    :cond_2
    const/16 v1, 0xb

    if-lt v0, v1, :cond_3

    .line 237
    new-instance v0, Landroid/support/v4/view/ag;

    invoke-direct {v0}, Landroid/support/v4/view/ag;-><init>()V

    sput-object v0, Landroid/support/v4/view/ad;->a:Landroid/support/v4/view/aj;

    goto :goto_0

    .line 238
    :cond_3
    const/16 v1, 0x9

    if-lt v0, v1, :cond_4

    .line 239
    new-instance v0, Landroid/support/v4/view/af;

    invoke-direct {v0}, Landroid/support/v4/view/af;-><init>()V

    sput-object v0, Landroid/support/v4/view/ad;->a:Landroid/support/v4/view/aj;

    goto :goto_0

    .line 241
    :cond_4
    new-instance v0, Landroid/support/v4/view/ae;

    invoke-direct {v0}, Landroid/support/v4/view/ae;-><init>()V

    sput-object v0, Landroid/support/v4/view/ad;->a:Landroid/support/v4/view/aj;

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 186
    return-void
.end method

.method public static a(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 277
    sget-object v0, Landroid/support/v4/view/ad;->a:Landroid/support/v4/view/aj;

    invoke-interface {v0, p0}, Landroid/support/v4/view/aj;->a(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static a(Landroid/view/View;Landroid/support/v4/view/a;)V
    .locals 1

    .prologue
    .line 414
    sget-object v0, Landroid/support/v4/view/ad;->a:Landroid/support/v4/view/aj;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/aj;->a(Landroid/view/View;Landroid/support/v4/view/a;)V

    .line 415
    return-void
.end method

.method public static a(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 482
    sget-object v0, Landroid/support/v4/view/ad;->a:Landroid/support/v4/view/aj;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/aj;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 483
    return-void
.end method

.method public static a(Landroid/view/View;I)Z
    .locals 1

    .prologue
    .line 253
    sget-object v0, Landroid/support/v4/view/ad;->a:Landroid/support/v4/view/aj;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/aj;->a(Landroid/view/View;I)Z

    move-result v0

    return v0
.end method

.method public static b(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 450
    sget-object v0, Landroid/support/v4/view/ad;->a:Landroid/support/v4/view/aj;

    invoke-interface {v0, p0}, Landroid/support/v4/view/aj;->b(Landroid/view/View;)V

    .line 451
    return-void
.end method

.method public static b(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 531
    sget-object v0, Landroid/support/v4/view/ad;->a:Landroid/support/v4/view/aj;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/aj;->b(Landroid/view/View;I)V

    .line 532
    return-void
.end method

.method public static c(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 515
    sget-object v0, Landroid/support/v4/view/ad;->a:Landroid/support/v4/view/aj;

    invoke-interface {v0, p0}, Landroid/support/v4/view/aj;->c(Landroid/view/View;)I

    move-result v0

    return v0
.end method
