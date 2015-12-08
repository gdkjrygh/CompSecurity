.class final Lcom/roidapp/imagelib/filter/bb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/az;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/filter/az;)V
    .locals 0

    .prologue
    .line 102
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/bb;->a:Lcom/roidapp/imagelib/filter/az;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 107
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 108
    return-void
.end method
