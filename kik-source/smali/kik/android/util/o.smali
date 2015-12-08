.class final Lkik/android/util/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cache/ad$d;


# instance fields
.field final synthetic a:Lcom/kik/g/p;


# direct methods
.method constructor <init>(Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 891
    iput-object p1, p0, Lkik/android/util/o;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/volley/w;)V
    .locals 1

    .prologue
    .line 911
    iget-object v0, p0, Lkik/android/util/o;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 912
    return-void
.end method

.method public final a(Lcom/kik/cache/ad$c;Z)V
    .locals 3

    .prologue
    .line 895
    if-nez p1, :cond_1

    .line 896
    iget-object v0, p0, Lkik/android/util/o;->a:Lcom/kik/g/p;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "null response"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 906
    :cond_0
    :goto_0
    return-void

    .line 899
    :cond_1
    invoke-virtual {p1}, Lcom/kik/cache/ad$c;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_2

    if-nez p2, :cond_0

    .line 903
    :cond_2
    iget-object v0, p0, Lkik/android/util/o;->a:Lcom/kik/g/p;

    invoke-virtual {p1}, Lcom/kik/cache/ad$c;->b()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method
