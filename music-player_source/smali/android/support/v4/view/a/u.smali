.class public final Landroid/support/v4/view/a/u;
.super Ljava/lang/Object;


# static fields
.field private static final a:Landroid/support/v4/view/a/x;


# instance fields
.field private final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/view/a/y;

    invoke-direct {v0}, Landroid/support/v4/view/a/y;-><init>()V

    sput-object v0, Landroid/support/v4/view/a/u;->a:Landroid/support/v4/view/a/x;

    :goto_0
    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xf

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/support/v4/view/a/w;

    invoke-direct {v0}, Landroid/support/v4/view/a/w;-><init>()V

    sput-object v0, Landroid/support/v4/view/a/u;->a:Landroid/support/v4/view/a/x;

    goto :goto_0

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_2

    new-instance v0, Landroid/support/v4/view/a/v;

    invoke-direct {v0}, Landroid/support/v4/view/a/v;-><init>()V

    sput-object v0, Landroid/support/v4/view/a/u;->a:Landroid/support/v4/view/a/x;

    goto :goto_0

    :cond_2
    new-instance v0, Landroid/support/v4/view/a/z;

    invoke-direct {v0}, Landroid/support/v4/view/a/z;-><init>()V

    sput-object v0, Landroid/support/v4/view/a/u;->a:Landroid/support/v4/view/a/x;

    goto :goto_0
.end method

.method private constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/v4/view/a/u;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a()Landroid/support/v4/view/a/u;
    .locals 2

    new-instance v0, Landroid/support/v4/view/a/u;

    sget-object v1, Landroid/support/v4/view/a/u;->a:Landroid/support/v4/view/a/x;

    invoke-interface {v1}, Landroid/support/v4/view/a/x;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/view/a/u;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    sget-object v0, Landroid/support/v4/view/a/u;->a:Landroid/support/v4/view/a/x;

    iget-object v1, p0, Landroid/support/v4/view/a/u;->b:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Landroid/support/v4/view/a/x;->b(Ljava/lang/Object;I)V

    return-void
.end method

.method public final a(Z)V
    .locals 2

    sget-object v0, Landroid/support/v4/view/a/u;->a:Landroid/support/v4/view/a/x;

    iget-object v1, p0, Landroid/support/v4/view/a/u;->b:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Landroid/support/v4/view/a/x;->a(Ljava/lang/Object;Z)V

    return-void
.end method

.method public final b(I)V
    .locals 2

    sget-object v0, Landroid/support/v4/view/a/u;->a:Landroid/support/v4/view/a/x;

    iget-object v1, p0, Landroid/support/v4/view/a/u;->b:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Landroid/support/v4/view/a/x;->a(Ljava/lang/Object;I)V

    return-void
.end method

.method public final c(I)V
    .locals 2

    sget-object v0, Landroid/support/v4/view/a/u;->a:Landroid/support/v4/view/a/x;

    iget-object v1, p0, Landroid/support/v4/view/a/u;->b:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Landroid/support/v4/view/a/x;->c(Ljava/lang/Object;I)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-nez p1, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    check-cast p1, Landroid/support/v4/view/a/u;

    iget-object v2, p0, Landroid/support/v4/view/a/u;->b:Ljava/lang/Object;

    if-nez v2, :cond_4

    iget-object v2, p1, Landroid/support/v4/view/a/u;->b:Ljava/lang/Object;

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_4
    iget-object v2, p0, Landroid/support/v4/view/a/u;->b:Ljava/lang/Object;

    iget-object v3, p1, Landroid/support/v4/view/a/u;->b:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroid/support/v4/view/a/u;->b:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v4/view/a/u;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0
.end method
