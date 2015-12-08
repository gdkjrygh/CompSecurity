.class public abstract Lkik/android/gifs/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/gifs/a/b$a;
    }
.end annotation


# instance fields
.field protected a:Lcom/android/volley/p;


# direct methods
.method protected constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-static {p1}, Lcom/android/volley/toolbox/t;->a(Landroid/content/Context;)Lcom/android/volley/p;

    move-result-object v0

    iput-object v0, p0, Lkik/android/gifs/a/b;->a:Lcom/android/volley/p;

    .line 38
    return-void
.end method


# virtual methods
.method public abstract a()Lcom/kik/g/p;
.end method

.method public abstract a(Ljava/lang/String;ILjava/util/Locale;)Lcom/kik/g/p;
.end method

.method public abstract a(Ljava/util/Locale;)Lcom/kik/g/p;
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lkik/android/gifs/a/b;->a:Lcom/android/volley/p;

    if-eqz v0, :cond_0

    .line 120
    iget-object v0, p0, Lkik/android/gifs/a/b;->a:Lcom/android/volley/p;

    invoke-virtual {v0, p1}, Lcom/android/volley/p;->a(Ljava/lang/Object;)V

    .line 122
    :cond_0
    return-void
.end method

.method public abstract a(Ljava/lang/String;Ljava/lang/String;I)V
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lkik/android/gifs/a/b;->a:Lcom/android/volley/p;

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lkik/android/gifs/a/b;->a:Lcom/android/volley/p;

    invoke-virtual {v0}, Lcom/android/volley/p;->b()V

    .line 127
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/gifs/a/b;->a:Lcom/android/volley/p;

    .line 129
    :cond_0
    return-void
.end method
