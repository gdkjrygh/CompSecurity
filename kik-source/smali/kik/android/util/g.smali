.class final Lkik/android/util/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cache/ad$d;


# instance fields
.field final synthetic a:Lkik/android/util/e$b;


# direct methods
.method constructor <init>(Lkik/android/util/e$b;)V
    .locals 0

    .prologue
    .line 1024
    iput-object p1, p0, Lkik/android/util/g;->a:Lkik/android/util/e$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/volley/w;)V
    .locals 0

    .prologue
    .line 1036
    return-void
.end method

.method public final a(Lcom/kik/cache/ad$c;Z)V
    .locals 2

    .prologue
    .line 1028
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 1029
    iget-object v0, p0, Lkik/android/util/g;->a:Lkik/android/util/e$b;

    invoke-virtual {p1}, Lcom/kik/cache/ad$c;->b()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/util/e$b;->a(Landroid/graphics/Bitmap;)V

    .line 1031
    :cond_0
    return-void
.end method
