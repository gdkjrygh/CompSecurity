.class final Lcom/mobvista/sdk/m/a/d/a/b;
.super Lcom/mobvista/sdk/m/a/d/a/l;
.source "360Security"


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/a/d/a/a;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/a/d/a/a;I)V
    .locals 0

    .prologue
    .line 106
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/d/a/b;->a:Lcom/mobvista/sdk/m/a/d/a/a;

    invoke-direct {p0, p2}, Lcom/mobvista/sdk/m/a/d/a/l;-><init>(I)V

    return-void
.end method

.method private static a(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 114
    const-class v0, Lcom/mobvista/sdk/m/a/d/a/n;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    check-cast p0, Lcom/mobvista/sdk/m/a/d/a/n;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/mobvista/sdk/m/a/d/a/n;->a(Z)V

    .line 120
    :cond_0
    return-void
.end method

.method private static b(Landroid/graphics/drawable/Drawable;)I
    .locals 1

    .prologue
    .line 128
    invoke-static {p0}, Lcom/mobvista/sdk/m/a/d/a/a;->a(Landroid/graphics/drawable/Drawable;)I

    move-result v0

    .line 129
    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method


# virtual methods
.method protected final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 106
    check-cast p2, Landroid/graphics/drawable/Drawable;

    invoke-static {p2}, Lcom/mobvista/sdk/m/a/d/a/b;->b(Landroid/graphics/drawable/Drawable;)I

    move-result v0

    return v0
.end method

.method protected final bridge synthetic a(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 106
    check-cast p3, Landroid/graphics/drawable/Drawable;

    invoke-static {p3}, Lcom/mobvista/sdk/m/a/d/a/b;->a(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
