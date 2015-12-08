.class final Lcom/kik/cache/ba;
.super Landroid/graphics/Paint;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cache/SoftwareContactImageView;


# direct methods
.method constructor <init>(Lcom/kik/cache/SoftwareContactImageView;)V
    .locals 2

    .prologue
    .line 25
    iput-object p1, p0, Lcom/kik/cache/ba;->a:Lcom/kik/cache/SoftwareContactImageView;

    invoke-direct {p0}, Landroid/graphics/Paint;-><init>()V

    .line 27
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/kik/cache/ba;->setAntiAlias(Z)V

    .line 28
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p0, v0}, Lcom/kik/cache/ba;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 29
    return-void
.end method
