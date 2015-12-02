.class public final Lcom/mobvista/sdk/m/a/d/a/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Lcom/mobvista/sdk/m/a/d/a/a;


# instance fields
.field private b:Lcom/mobvista/sdk/m/a/d/a/l;

.field private c:Lcom/mobvista/sdk/m/a/d/a/c;


# direct methods
.method private constructor <init>(Lcom/mobvista/sdk/m/a/d/a/c;)V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    invoke-direct {p0, p1}, Lcom/mobvista/sdk/m/a/d/a/a;->b(Lcom/mobvista/sdk/m/a/d/a/c;)V

    .line 66
    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;)I
    .locals 3

    .prologue
    .line 285
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-static {}, Lcom/mobvista/sdk/m/a/f/b;->c()F

    move-result v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    .line 287
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-static {}, Lcom/mobvista/sdk/m/a/f/b;->c()F

    move-result v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    .line 290
    mul-int/2addr v0, v1

    return v0
.end method

.method public static a(Lcom/mobvista/sdk/m/a/d/a/c;)Lcom/mobvista/sdk/m/a/d/a/a;
    .locals 1

    .prologue
    .line 84
    sget-object v0, Lcom/mobvista/sdk/m/a/d/a/a;->a:Lcom/mobvista/sdk/m/a/d/a/a;

    if-nez v0, :cond_0

    .line 85
    new-instance v0, Lcom/mobvista/sdk/m/a/d/a/a;

    invoke-direct {v0, p0}, Lcom/mobvista/sdk/m/a/d/a/a;-><init>(Lcom/mobvista/sdk/m/a/d/a/c;)V

    sput-object v0, Lcom/mobvista/sdk/m/a/d/a/a;->a:Lcom/mobvista/sdk/m/a/d/a/a;

    .line 88
    :cond_0
    sget-object v0, Lcom/mobvista/sdk/m/a/d/a/a;->a:Lcom/mobvista/sdk/m/a/d/a/a;

    return-object v0
.end method

.method private b(Lcom/mobvista/sdk/m/a/d/a/c;)V
    .locals 2

    .prologue
    .line 98
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/d/a/a;->c:Lcom/mobvista/sdk/m/a/d/a/c;

    .line 101
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/a;->c:Lcom/mobvista/sdk/m/a/d/a/c;

    iget-boolean v0, v0, Lcom/mobvista/sdk/m/a/d/a/c;->b:Z

    if-eqz v0, :cond_0

    .line 105
    new-instance v0, Lcom/mobvista/sdk/m/a/d/a/b;

    iget-object v1, p0, Lcom/mobvista/sdk/m/a/d/a/a;->c:Lcom/mobvista/sdk/m/a/d/a/c;

    iget v1, v1, Lcom/mobvista/sdk/m/a/d/a/c;->a:I

    invoke-direct {v0, p0, v1}, Lcom/mobvista/sdk/m/a/d/a/b;-><init>(Lcom/mobvista/sdk/m/a/d/a/a;I)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/a;->b:Lcom/mobvista/sdk/m/a/d/a/l;

    .line 133
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 169
    const/4 v0, 0x0

    .line 170
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/d/a/a;->b:Lcom/mobvista/sdk/m/a/d/a/l;

    if-eqz v1, :cond_0

    .line 171
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/a;->b:Lcom/mobvista/sdk/m/a/d/a/l;

    invoke-virtual {v0, p1}, Lcom/mobvista/sdk/m/a/d/a/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 175
    :cond_0
    return-object v0
.end method

.method public final a()V
    .locals 2

    .prologue
    .line 187
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/a;->b:Lcom/mobvista/sdk/m/a/d/a/l;

    if-eqz v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/a;->b:Lcom/mobvista/sdk/m/a/d/a/l;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/d/a/l;->a()V

    .line 189
    const-string/jumbo v0, "ImageCache"

    const-string/jumbo v1, "Memory cache cleared"

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/a/b/a/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .prologue
    .line 144
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 159
    :cond_0
    :goto_0
    return-void

    .line 150
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/a;->b:Lcom/mobvista/sdk/m/a/d/a/l;

    if-eqz v0, :cond_0

    .line 151
    const-class v0, Lcom/mobvista/sdk/m/a/d/a/n;

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v0, p2

    .line 154
    check-cast v0, Lcom/mobvista/sdk/m/a/d/a/n;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/a/d/a/n;->a(Z)V

    .line 156
    :cond_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/a;->b:Lcom/mobvista/sdk/m/a/d/a/l;

    invoke-virtual {v0, p1, p2}, Lcom/mobvista/sdk/m/a/d/a/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method
