.class Lcom/scannerfire/fragment/FragmentCrea$1;
.super Ljava/lang/Object;
.source "FragmentCrea.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scannerfire/fragment/FragmentCrea;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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
.field final synthetic this$0:Lcom/scannerfire/fragment/FragmentCrea;


# direct methods
.method constructor <init>(Lcom/scannerfire/fragment/FragmentCrea;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 12
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
    .line 72
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    invoke-virtual {v8}, Lcom/scannerfire/fragment/FragmentCrea;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-virtual {v8}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v8

    invoke-static {v8}, Lcom/scannerfire/utils/Utils;->getVibratePref(Landroid/content/Context;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 73
    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    iget-object v8, v8, Lcom/scannerfire/fragment/FragmentCrea;->vib:Landroid/os/Vibrator;

    const-wide/16 v10, 0x3c

    invoke-virtual {v8, v10, v11}, Landroid/os/Vibrator;->vibrate(J)V

    .line 74
    :cond_0
    packed-switch p3, :pswitch_data_0

    .line 122
    :goto_0
    return-void

    .line 77
    :pswitch_0
    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    # invokes: Lcom/scannerfire/fragment/FragmentCrea;->pickContact()V
    invoke-static {v8}, Lcom/scannerfire/fragment/FragmentCrea;->access$0(Lcom/scannerfire/fragment/FragmentCrea;)V

    goto :goto_0

    .line 81
    :pswitch_1
    new-instance v0, Landroid/content/Intent;

    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    invoke-virtual {v8}, Lcom/scannerfire/fragment/FragmentCrea;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    const-class v9, Lcom/QRBS/activity/CreateTel;

    invoke-direct {v0, v8, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 82
    .local v0, "i":Landroid/content/Intent;
    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    invoke-virtual {v8}, Lcom/scannerfire/fragment/FragmentCrea;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-virtual {v8, v0}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 86
    .end local v0    # "i":Landroid/content/Intent;
    :pswitch_2
    new-instance v1, Landroid/content/Intent;

    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    invoke-virtual {v8}, Lcom/scannerfire/fragment/FragmentCrea;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    const-class v9, Lcom/QRBS/activity/CreateUrl;

    invoke-direct {v1, v8, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 87
    .local v1, "i2":Landroid/content/Intent;
    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    invoke-virtual {v8}, Lcom/scannerfire/fragment/FragmentCrea;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-virtual {v8, v1}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 91
    .end local v1    # "i2":Landroid/content/Intent;
    :pswitch_3
    new-instance v2, Landroid/content/Intent;

    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    invoke-virtual {v8}, Lcom/scannerfire/fragment/FragmentCrea;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    const-class v9, Lcom/QRBS/activity/CreateEmail;

    invoke-direct {v2, v8, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 92
    .local v2, "i3":Landroid/content/Intent;
    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    invoke-virtual {v8}, Lcom/scannerfire/fragment/FragmentCrea;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-virtual {v8, v2}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 96
    .end local v2    # "i3":Landroid/content/Intent;
    :pswitch_4
    new-instance v3, Landroid/content/Intent;

    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    invoke-virtual {v8}, Lcom/scannerfire/fragment/FragmentCrea;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    const-class v9, Lcom/QRBS/activity/CreateApp;

    invoke-direct {v3, v8, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 97
    .local v3, "i4":Landroid/content/Intent;
    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    invoke-virtual {v8}, Lcom/scannerfire/fragment/FragmentCrea;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-virtual {v8, v3}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 101
    .end local v3    # "i4":Landroid/content/Intent;
    :pswitch_5
    new-instance v4, Landroid/content/Intent;

    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    invoke-virtual {v8}, Lcom/scannerfire/fragment/FragmentCrea;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    const-class v9, Lcom/QRBS/activity/CreateGps;

    invoke-direct {v4, v8, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 102
    .local v4, "i5":Landroid/content/Intent;
    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    invoke-virtual {v8}, Lcom/scannerfire/fragment/FragmentCrea;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-virtual {v8, v4}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 106
    .end local v4    # "i5":Landroid/content/Intent;
    :pswitch_6
    new-instance v5, Landroid/content/Intent;

    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    invoke-virtual {v8}, Lcom/scannerfire/fragment/FragmentCrea;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    const-class v9, Lcom/QRBS/activity/FreeText;

    invoke-direct {v5, v8, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 107
    .local v5, "i6":Landroid/content/Intent;
    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    invoke-virtual {v8}, Lcom/scannerfire/fragment/FragmentCrea;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-virtual {v8, v5}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 112
    .end local v5    # "i6":Landroid/content/Intent;
    :pswitch_7
    new-instance v6, Landroid/content/Intent;

    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    invoke-virtual {v8}, Lcom/scannerfire/fragment/FragmentCrea;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    const-class v9, Lcom/QRBS/activity/CreateBookmarks;

    invoke-direct {v6, v8, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 113
    .local v6, "i7":Landroid/content/Intent;
    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    invoke-virtual {v8}, Lcom/scannerfire/fragment/FragmentCrea;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-virtual {v8, v6}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 117
    .end local v6    # "i7":Landroid/content/Intent;
    :pswitch_8
    new-instance v7, Landroid/content/Intent;

    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    invoke-virtual {v8}, Lcom/scannerfire/fragment/FragmentCrea;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    const-class v9, Lcom/QRBS/activity/CreateCalendar;

    invoke-direct {v7, v8, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 118
    .local v7, "i8":Landroid/content/Intent;
    iget-object v8, p0, Lcom/scannerfire/fragment/FragmentCrea$1;->this$0:Lcom/scannerfire/fragment/FragmentCrea;

    invoke-virtual {v8}, Lcom/scannerfire/fragment/FragmentCrea;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 74
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method
