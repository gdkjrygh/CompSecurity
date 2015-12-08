.class Lcom/scannerfire/fragment/FragmentProva$1;
.super Ljava/lang/Object;
.source "FragmentProva.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scannerfire/fragment/FragmentProva;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/widget/AdapterView$OnItemClickListener;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scannerfire/fragment/FragmentProva;


# direct methods
.method constructor <init>(Lcom/scannerfire/fragment/FragmentProva;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/scannerfire/fragment/FragmentProva$1;->this$0:Lcom/scannerfire/fragment/FragmentProva;

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
    .param p2, "arg1"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "arg3"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 80
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    iget-object v3, p0, Lcom/scannerfire/fragment/FragmentProva$1;->this$0:Lcom/scannerfire/fragment/FragmentProva;

    invoke-virtual {v3}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/scannerfire/utils/Utils;->getVibratePref(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 81
    iget-object v3, p0, Lcom/scannerfire/fragment/FragmentProva$1;->this$0:Lcom/scannerfire/fragment/FragmentProva;

    iget-object v3, v3, Lcom/scannerfire/fragment/FragmentProva;->vib:Landroid/os/Vibrator;

    const-wide/16 v4, 0x3c

    invoke-virtual {v3, v4, v5}, Landroid/os/Vibrator;->vibrate(J)V

    .line 82
    :cond_0
    packed-switch p3, :pswitch_data_0

    .line 105
    :goto_0
    return-void

    .line 85
    :pswitch_0
    new-instance v0, Landroid/content/Intent;

    iget-object v3, p0, Lcom/scannerfire/fragment/FragmentProva$1;->this$0:Lcom/scannerfire/fragment/FragmentProva;

    invoke-virtual {v3}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    const-class v4, Lcom/QRBS/activity/QrActivity;

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 86
    .local v0, "intent":Landroid/content/Intent;
    iget-object v3, p0, Lcom/scannerfire/fragment/FragmentProva$1;->this$0:Lcom/scannerfire/fragment/FragmentProva;

    invoke-virtual {v3}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 91
    .end local v0    # "intent":Landroid/content/Intent;
    :pswitch_1
    new-instance v1, Landroid/content/Intent;

    iget-object v3, p0, Lcom/scannerfire/fragment/FragmentProva$1;->this$0:Lcom/scannerfire/fragment/FragmentProva;

    invoke-virtual {v3}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    const-class v4, Lcom/QRBS/activity/ManualInsert;

    invoke-direct {v1, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 92
    .local v1, "intent1":Landroid/content/Intent;
    iget-object v3, p0, Lcom/scannerfire/fragment/FragmentProva$1;->this$0:Lcom/scannerfire/fragment/FragmentProva;

    invoke-virtual {v3}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 97
    .end local v1    # "intent1":Landroid/content/Intent;
    :pswitch_2
    iget-object v3, p0, Lcom/scannerfire/fragment/FragmentProva$1;->this$0:Lcom/scannerfire/fragment/FragmentProva;

    # invokes: Lcom/scannerfire/fragment/FragmentProva;->callGallery()V
    invoke-static {v3}, Lcom/scannerfire/fragment/FragmentProva;->access$0(Lcom/scannerfire/fragment/FragmentProva;)V

    goto :goto_0

    .line 101
    :pswitch_3
    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lcom/scannerfire/fragment/FragmentProva$1;->this$0:Lcom/scannerfire/fragment/FragmentProva;

    invoke-virtual {v3}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    const-class v4, Lcom/QRBS/activity/FromURL;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 102
    .local v2, "intent3":Landroid/content/Intent;
    iget-object v3, p0, Lcom/scannerfire/fragment/FragmentProva$1;->this$0:Lcom/scannerfire/fragment/FragmentProva;

    invoke-virtual {v3}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 82
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
