.class public abstract Lkik/android/d/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/d/b$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private c:Ljava/lang/Object;

.field private final d:Ljava/lang/Object;

.field private final e:Ljava/util/List;

.field private final f:Ljava/lang/Runnable;

.field private g:Lkik/android/util/ar;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;Ljava/lang/Runnable;Lkik/android/util/ar;)V
    .locals 2

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lkik/android/d/b;->a:Landroid/content/Context;

    .line 38
    if-nez p2, :cond_0

    .line 39
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Name cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 41
    :cond_0
    iput-object p2, p0, Lkik/android/d/b;->b:Ljava/lang/String;

    .line 42
    if-nez p3, :cond_1

    .line 43
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "DefaultValue cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_1
    iput-object p3, p0, Lkik/android/d/b;->d:Ljava/lang/Object;

    .line 46
    if-nez p4, :cond_3

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/d/b;->e:Ljava/util/List;

    .line 56
    :cond_2
    iput-object p5, p0, Lkik/android/d/b;->f:Ljava/lang/Runnable;

    .line 58
    iput-object p6, p0, Lkik/android/d/b;->g:Lkik/android/util/ar;

    .line 60
    iget-object v0, p0, Lkik/android/d/b;->g:Lkik/android/util/ar;

    invoke-virtual {p0, v0}, Lkik/android/d/b;->b(Lkik/android/util/ar;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lkik/android/d/b;->c:Ljava/lang/Object;

    .line 61
    return-void

    .line 50
    :cond_3
    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lkik/android/d/b;->e:Ljava/util/List;

    .line 51
    iget-object v0, p0, Lkik/android/d/b;->e:Ljava/util/List;

    iget-object v1, p0, Lkik/android/d/b;->d:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 52
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Allowed values must contain defaultValue"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method protected abstract a(Lkik/android/util/ar;)V
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lkik/android/d/b;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/d/b;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 119
    :cond_0
    iput-object p1, p0, Lkik/android/d/b;->c:Ljava/lang/Object;

    .line 120
    iget-object v0, p0, Lkik/android/d/b;->g:Lkik/android/util/ar;

    invoke-virtual {p0, v0}, Lkik/android/d/b;->a(Lkik/android/util/ar;)V

    .line 121
    iget-object v0, p0, Lkik/android/d/b;->f:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    .line 122
    iget-object v0, p0, Lkik/android/d/b;->f:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 124
    :cond_1
    const/4 v0, 0x1

    .line 126
    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lkik/android/d/b;->c:Ljava/lang/Object;

    return-object v0
.end method

.method protected abstract b(Lkik/android/util/ar;)Ljava/lang/Object;
.end method

.method protected final c()Landroid/content/Context;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lkik/android/d/b;->a:Landroid/content/Context;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lkik/android/d/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lkik/android/d/b;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public final f()Ljava/util/List;
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lkik/android/d/b;->e:Ljava/util/List;

    return-object v0
.end method
