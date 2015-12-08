.class final Lcom/roidapp/photogrid/filter/selfiecam/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;)V
    .locals 0

    .prologue
    .line 355
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/h;->a:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 358
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 359
    return-void
.end method
