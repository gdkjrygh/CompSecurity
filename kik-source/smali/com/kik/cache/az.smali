.class final Lcom/kik/cache/az;
.super Landroid/graphics/Paint;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cache/SoftwareContactImageView;


# direct methods
.method constructor <init>(Lcom/kik/cache/SoftwareContactImageView;)V
    .locals 1

    .prologue
    .line 19
    iput-object p1, p0, Lcom/kik/cache/az;->a:Lcom/kik/cache/SoftwareContactImageView;

    invoke-direct {p0}, Landroid/graphics/Paint;-><init>()V

    .line 21
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/kik/cache/az;->setAntiAlias(Z)V

    .line 22
    return-void
.end method
