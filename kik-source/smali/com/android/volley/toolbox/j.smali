.class final Lcom/android/volley/toolbox/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/volley/r$b;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/android/volley/toolbox/i;


# direct methods
.method constructor <init>(Lcom/android/volley/toolbox/i;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 230
    iput-object p1, p0, Lcom/android/volley/toolbox/j;->b:Lcom/android/volley/toolbox/i;

    iput-object p2, p0, Lcom/android/volley/toolbox/j;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 230
    check-cast p1, Landroid/graphics/Bitmap;

    iget-object v0, p0, Lcom/android/volley/toolbox/j;->b:Lcom/android/volley/toolbox/i;

    iget-object v1, p0, Lcom/android/volley/toolbox/j;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/android/volley/toolbox/i;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method
