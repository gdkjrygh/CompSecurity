.class final Lcom/roidapp/cloudlib/upload/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/widget/ImageView;

.field final synthetic b:Lcom/roidapp/cloudlib/upload/o;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/upload/o;Landroid/widget/ImageView;)V
    .locals 0

    .prologue
    .line 377
    iput-object p1, p0, Lcom/roidapp/cloudlib/upload/q;->b:Lcom/roidapp/cloudlib/upload/o;

    iput-object p2, p0, Lcom/roidapp/cloudlib/upload/q;->a:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 383
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/upload/q;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    .line 384
    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 388
    :goto_0
    return-void

    .line 386
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/ClassCastException;->printStackTrace()V

    goto :goto_0
.end method
