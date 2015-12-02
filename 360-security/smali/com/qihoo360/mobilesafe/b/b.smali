.class public Lcom/qihoo360/mobilesafe/b/b;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a()V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 28
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v2

    .line 29
    const-string/jumbo v1, "key_update_next_check_values"

    invoke-static {v2, v1, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v1

    .line 34
    packed-switch v1, :pswitch_data_0

    .line 62
    :goto_0
    add-int/lit8 v1, v1, 0x1

    .line 63
    const/4 v3, 0x4

    if-lt v1, v3, :cond_0

    .line 66
    :goto_1
    const-string/jumbo v1, "key_update_next_check_values"

    invoke-static {v2, v1, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 67
    return-void

    .line 36
    :pswitch_0
    invoke-static {}, Lcom/qihoo/security/support/b;->a()V

    .line 37
    invoke-static {}, Lcom/qihoo/security/adv/a/a;->a()Lcom/qihoo/security/adv/a/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/qihoo/security/adv/a/a;->b()V

    goto :goto_0

    .line 40
    :pswitch_1
    invoke-static {}, Lcom/qihoo/security/v5/UpdateService;->a()V

    goto :goto_0

    .line 44
    :pswitch_2
    invoke-static {}, Lcom/qihoo/security/appbox/bi/a;->a()V

    .line 45
    invoke-static {}, Lcom/qihoo/security/installreport/a;->a()V

    .line 46
    invoke-static {}, Lcom/qihoo/security/adv/a/a;->a()Lcom/qihoo/security/adv/a/a;

    move-result-object v3

    sget-object v4, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->PrepareAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v3, v4}, Lcom/qihoo/security/adv/a/a;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    goto :goto_0

    .line 55
    :pswitch_3
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/a;->a()Lcom/qihoo/security/opti/trashclear/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/qihoo/security/opti/trashclear/a;->b()V

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    .line 34
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
