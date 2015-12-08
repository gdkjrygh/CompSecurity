.class public final Lkik/android/gifs/a/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/gifs/a/f$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private final b:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lkik/android/gifs/a/f;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lkik/android/gifs/a/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final a(Lkik/android/gifs/a/f$a;)Lkik/android/gifs/a/e;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lkik/android/gifs/a/f;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/gifs/a/e;

    return-object v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lkik/android/gifs/a/f;->a:Ljava/lang/String;

    .line 35
    return-void
.end method

.method protected final a(Lkik/android/gifs/a/f$a;Lkik/android/gifs/a/e;)V
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lkik/android/gifs/a/f;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    return-void
.end method

.method protected final b()Z
    .locals 2

    .prologue
    .line 55
    iget-object v0, p0, Lkik/android/gifs/a/f;->b:Ljava/util/Map;

    sget-object v1, Lkik/android/gifs/a;->d:Lkik/android/gifs/a/f$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/gifs/a/f;->b:Ljava/util/Map;

    sget-object v1, Lkik/android/gifs/a;->c:Lkik/android/gifs/a/f$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Lkik/android/gifs/a/e;
    .locals 2

    .prologue
    .line 60
    iget-object v0, p0, Lkik/android/gifs/a/f;->b:Ljava/util/Map;

    sget-object v1, Lkik/android/gifs/a;->c:Lkik/android/gifs/a/f$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/gifs/a/e;

    return-object v0
.end method
