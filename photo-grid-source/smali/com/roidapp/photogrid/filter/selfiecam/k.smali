.class final Lcom/roidapp/photogrid/filter/selfiecam/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 671
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/k;->c:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    iput-object p2, p0, Lcom/roidapp/photogrid/filter/selfiecam/k;->a:Ljava/lang/Throwable;

    iput-object p3, p0, Lcom/roidapp/photogrid/filter/selfiecam/k;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 675
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/k;->c:Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/k;->a:Ljava/lang/Throwable;

    iget-object v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/k;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 676
    return-void
.end method
