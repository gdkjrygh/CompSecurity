.class public final Lb/a/a/a/a/f/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/a/f/b;


# instance fields
.field private final a:Landroid/content/SharedPreferences;

.field private final b:Ljava/lang/String;

.field private final c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    if-nez p1, :cond_0

    .line 34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot get directory before context has been set. Call Fabric.with() first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 37
    :cond_0
    iput-object p1, p0, Lb/a/a/a/a/f/c;->c:Landroid/content/Context;

    .line 38
    iput-object p2, p0, Lb/a/a/a/a/f/c;->b:Ljava/lang/String;

    .line 39
    iget-object v0, p0, Lb/a/a/a/a/f/c;->c:Landroid/content/Context;

    iget-object v1, p0, Lb/a/a/a/a/f/c;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lb/a/a/a/a/f/c;->a:Landroid/content/SharedPreferences;

    .line 40
    return-void
.end method

.method public constructor <init>(Lb/a/a/a/l;)V
    .locals 2

    .prologue
    .line 44
    invoke-virtual {p1}, Lb/a/a/a/l;->v()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lb/a/a/a/a/f/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 45
    return-void
.end method


# virtual methods
.method public final a()Landroid/content/SharedPreferences;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lb/a/a/a/a/f/c;->a:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public final a(Landroid/content/SharedPreferences$Editor;)Z
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 71
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 72
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 73
    const/4 v0, 0x1

    .line 75
    :goto_0
    return v0

    :cond_0
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    goto :goto_0
.end method

.method public final b()Landroid/content/SharedPreferences$Editor;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lb/a/a/a/a/f/c;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    return-object v0
.end method
