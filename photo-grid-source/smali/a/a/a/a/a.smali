.class public final La/a/a/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/app/Application;

.field private b:La/a/a/a/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    iput-object v0, p0, La/a/a/a/a;->a:Landroid/app/Application;

    .line 57
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 58
    new-instance v0, La/a/a/a/b;

    iget-object v1, p0, La/a/a/a/a;->a:Landroid/app/Application;

    invoke-direct {v0, v1}, La/a/a/a/b;-><init>(Landroid/app/Application;)V

    iput-object v0, p0, La/a/a/a/a;->b:La/a/a/a/b;

    .line 60
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/a/b;

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/a/b;

    invoke-static {v0}, La/a/a/a/b;->a(La/a/a/a/b;)V

    .line 79
    :cond_0
    return-void
.end method

.method public final a(La/a/a/a/d;)Z
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, La/a/a/a/a;->b:La/a/a/a/b;

    invoke-static {v0, p1}, La/a/a/a/b;->a(La/a/a/a/b;La/a/a/a/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
