.class final Lcom/kik/cache/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/kik/cache/k;


# direct methods
.method constructor <init>(Lcom/kik/cache/k;I)V
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lcom/kik/cache/m;->b:Lcom/kik/cache/k;

    iput p2, p0, Lcom/kik/cache/m;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 56
    check-cast p1, Landroid/graphics/Bitmap;

    iget v0, p0, Lcom/kik/cache/m;->a:I

    invoke-static {p1, v0}, Lkik/android/util/r;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
