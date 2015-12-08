.class Lcom/facebook/widget/LoginButton$LoginClickListener;
.super Ljava/lang/Object;
.source "LoginButton.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/LoginButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LoginClickListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/widget/LoginButton;


# direct methods
.method private constructor <init>(Lcom/facebook/widget/LoginButton;)V
    .locals 0

    .prologue
    .line 801
    iput-object p1, p0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/widget/LoginButton;Lcom/facebook/widget/LoginButton$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/facebook/widget/LoginButton;
    .param p2, "x1"    # Lcom/facebook/widget/LoginButton$1;

    .prologue
    .line 801
    invoke-direct {p0, p1}, Lcom/facebook/widget/LoginButton$LoginClickListener;-><init>(Lcom/facebook/widget/LoginButton;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 17
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 805
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    invoke-virtual {v13}, Lcom/facebook/widget/LoginButton;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 806
    .local v4, "context":Landroid/content/Context;
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    # getter for: Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    invoke-static {v13}, Lcom/facebook/widget/LoginButton;->access$400(Lcom/facebook/widget/LoginButton;)Lcom/facebook/internal/SessionTracker;

    move-result-object v13

    invoke-virtual {v13}, Lcom/facebook/internal/SessionTracker;->getOpenSession()Lcom/facebook/Session;

    move-result-object v10

    .line 808
    .local v10, "openSession":Lcom/facebook/Session;
    if-eqz v10, :cond_4

    .line 810
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    # getter for: Lcom/facebook/widget/LoginButton;->confirmLogout:Z
    invoke-static {v13}, Lcom/facebook/widget/LoginButton;->access$700(Lcom/facebook/widget/LoginButton;)Z

    move-result v13

    if-eqz v13, :cond_3

    .line 812
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    invoke-virtual {v13}, Lcom/facebook/widget/LoginButton;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    sget v14, Lcom/facebook/android/R$string;->com_facebook_loginview_log_out_action:I

    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 813
    .local v7, "logout":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    invoke-virtual {v13}, Lcom/facebook/widget/LoginButton;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    sget v14, Lcom/facebook/android/R$string;->com_facebook_loginview_cancel_action:I

    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 815
    .local v3, "cancel":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    # getter for: Lcom/facebook/widget/LoginButton;->user:Lcom/facebook/model/GraphUser;
    invoke-static {v13}, Lcom/facebook/widget/LoginButton;->access$500(Lcom/facebook/widget/LoginButton;)Lcom/facebook/model/GraphUser;

    move-result-object v13

    if-eqz v13, :cond_2

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    # getter for: Lcom/facebook/widget/LoginButton;->user:Lcom/facebook/model/GraphUser;
    invoke-static {v13}, Lcom/facebook/widget/LoginButton;->access$500(Lcom/facebook/widget/LoginButton;)Lcom/facebook/model/GraphUser;

    move-result-object v13

    invoke-interface {v13}, Lcom/facebook/model/GraphUser;->getName()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_2

    .line 816
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    invoke-virtual {v13}, Lcom/facebook/widget/LoginButton;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    sget v14, Lcom/facebook/android/R$string;->com_facebook_loginview_logged_in_as:I

    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x1

    new-array v14, v14, [Ljava/lang/Object;

    const/4 v15, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    move-object/from16 v16, v0

    # getter for: Lcom/facebook/widget/LoginButton;->user:Lcom/facebook/model/GraphUser;
    invoke-static/range {v16 .. v16}, Lcom/facebook/widget/LoginButton;->access$500(Lcom/facebook/widget/LoginButton;)Lcom/facebook/model/GraphUser;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Lcom/facebook/model/GraphUser;->getName()Ljava/lang/String;

    move-result-object v16

    aput-object v16, v14, v15

    invoke-static {v13, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 820
    .local v8, "message":Ljava/lang/String;
    :goto_0
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 821
    .local v2, "builder":Landroid/app/AlertDialog$Builder;
    invoke-virtual {v2, v8}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v13

    const/4 v14, 0x1

    .line 822
    invoke-virtual {v13, v14}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v13

    new-instance v14, Lcom/facebook/widget/LoginButton$LoginClickListener$1;

    move-object/from16 v0, p0

    invoke-direct {v14, v0, v10}, Lcom/facebook/widget/LoginButton$LoginClickListener$1;-><init>(Lcom/facebook/widget/LoginButton$LoginClickListener;Lcom/facebook/Session;)V

    .line 823
    invoke-virtual {v13, v7, v14}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v13

    const/4 v14, 0x0

    .line 828
    invoke-virtual {v13, v3, v14}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 829
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v13

    invoke-virtual {v13}, Landroid/app/AlertDialog;->show()V

    .line 868
    .end local v2    # "builder":Landroid/app/AlertDialog$Builder;
    .end local v3    # "cancel":Ljava/lang/String;
    .end local v4    # "context":Landroid/content/Context;
    .end local v7    # "logout":Ljava/lang/String;
    .end local v8    # "message":Ljava/lang/String;
    :cond_0
    :goto_1
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    invoke-virtual {v13}, Lcom/facebook/widget/LoginButton;->getContext()Landroid/content/Context;

    move-result-object v13

    invoke-static {v13}, Lcom/facebook/AppEventsLogger;->newLogger(Landroid/content/Context;)Lcom/facebook/AppEventsLogger;

    move-result-object v6

    .line 870
    .local v6, "logger":Lcom/facebook/AppEventsLogger;
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 871
    .local v11, "parameters":Landroid/os/Bundle;
    const-string v14, "logging_in"

    if-eqz v10, :cond_b

    const/4 v13, 0x0

    :goto_2
    invoke-virtual {v11, v14, v13}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 873
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    # getter for: Lcom/facebook/widget/LoginButton;->loginLogoutEventName:Ljava/lang/String;
    invoke-static {v13}, Lcom/facebook/widget/LoginButton;->access$1500(Lcom/facebook/widget/LoginButton;)Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    invoke-virtual {v6, v13, v14, v11}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 875
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    # getter for: Lcom/facebook/widget/LoginButton;->listenerCallback:Landroid/view/View$OnClickListener;
    invoke-static {v13}, Lcom/facebook/widget/LoginButton;->access$1600(Lcom/facebook/widget/LoginButton;)Landroid/view/View$OnClickListener;

    move-result-object v13

    if-eqz v13, :cond_1

    .line 876
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    # getter for: Lcom/facebook/widget/LoginButton;->listenerCallback:Landroid/view/View$OnClickListener;
    invoke-static {v13}, Lcom/facebook/widget/LoginButton;->access$1600(Lcom/facebook/widget/LoginButton;)Landroid/view/View$OnClickListener;

    move-result-object v13

    move-object/from16 v0, p1

    invoke-interface {v13, v0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 878
    :cond_1
    return-void

    .line 818
    .end local v6    # "logger":Lcom/facebook/AppEventsLogger;
    .end local v11    # "parameters":Landroid/os/Bundle;
    .restart local v3    # "cancel":Ljava/lang/String;
    .restart local v4    # "context":Landroid/content/Context;
    .restart local v7    # "logout":Ljava/lang/String;
    :cond_2
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    invoke-virtual {v13}, Lcom/facebook/widget/LoginButton;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    sget v14, Lcom/facebook/android/R$string;->com_facebook_loginview_logged_in_using_facebook:I

    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .restart local v8    # "message":Ljava/lang/String;
    goto :goto_0

    .line 831
    .end local v3    # "cancel":Ljava/lang/String;
    .end local v7    # "logout":Ljava/lang/String;
    .end local v8    # "message":Ljava/lang/String;
    :cond_3
    invoke-virtual {v10}, Lcom/facebook/Session;->closeAndClearTokenInformation()V

    goto :goto_1

    .line 834
    :cond_4
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    # getter for: Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    invoke-static {v13}, Lcom/facebook/widget/LoginButton;->access$400(Lcom/facebook/widget/LoginButton;)Lcom/facebook/internal/SessionTracker;

    move-result-object v13

    invoke-virtual {v13}, Lcom/facebook/internal/SessionTracker;->getSession()Lcom/facebook/Session;

    move-result-object v5

    .line 835
    .local v5, "currentSession":Lcom/facebook/Session;
    if-eqz v5, :cond_5

    invoke-virtual {v5}, Lcom/facebook/Session;->getState()Lcom/facebook/SessionState;

    move-result-object v13

    invoke-virtual {v13}, Lcom/facebook/SessionState;->isClosed()Z

    move-result v13

    if-eqz v13, :cond_6

    .line 836
    :cond_5
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    # getter for: Lcom/facebook/widget/LoginButton;->sessionTracker:Lcom/facebook/internal/SessionTracker;
    invoke-static {v13}, Lcom/facebook/widget/LoginButton;->access$400(Lcom/facebook/widget/LoginButton;)Lcom/facebook/internal/SessionTracker;

    move-result-object v13

    const/4 v14, 0x0

    invoke-virtual {v13, v14}, Lcom/facebook/internal/SessionTracker;->setSession(Lcom/facebook/Session;)V

    .line 837
    new-instance v13, Lcom/facebook/Session$Builder;

    invoke-direct {v13, v4}, Lcom/facebook/Session$Builder;-><init>(Landroid/content/Context;)V

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    # getter for: Lcom/facebook/widget/LoginButton;->applicationId:Ljava/lang/String;
    invoke-static {v14}, Lcom/facebook/widget/LoginButton;->access$800(Lcom/facebook/widget/LoginButton;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Lcom/facebook/Session$Builder;->setApplicationId(Ljava/lang/String;)Lcom/facebook/Session$Builder;

    move-result-object v13

    invoke-virtual {v13}, Lcom/facebook/Session$Builder;->build()Lcom/facebook/Session;

    move-result-object v12

    .line 838
    .local v12, "session":Lcom/facebook/Session;
    invoke-static {v12}, Lcom/facebook/Session;->setActiveSession(Lcom/facebook/Session;)V

    .line 839
    move-object v5, v12

    .line 841
    .end local v12    # "session":Lcom/facebook/Session;
    :cond_6
    invoke-virtual {v5}, Lcom/facebook/Session;->isOpened()Z

    move-result v13

    if-nez v13, :cond_0

    .line 842
    const/4 v9, 0x0

    .line 843
    .local v9, "openRequest":Lcom/facebook/Session$OpenRequest;
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    # getter for: Lcom/facebook/widget/LoginButton;->parentFragment:Landroid/support/v4/app/Fragment;
    invoke-static {v13}, Lcom/facebook/widget/LoginButton;->access$900(Lcom/facebook/widget/LoginButton;)Landroid/support/v4/app/Fragment;

    move-result-object v13

    if-eqz v13, :cond_8

    .line 844
    new-instance v9, Lcom/facebook/Session$OpenRequest;

    .end local v9    # "openRequest":Lcom/facebook/Session$OpenRequest;
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    # getter for: Lcom/facebook/widget/LoginButton;->parentFragment:Landroid/support/v4/app/Fragment;
    invoke-static {v13}, Lcom/facebook/widget/LoginButton;->access$900(Lcom/facebook/widget/LoginButton;)Landroid/support/v4/app/Fragment;

    move-result-object v13

    invoke-direct {v9, v13}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/support/v4/app/Fragment;)V

    .line 854
    .end local v4    # "context":Landroid/content/Context;
    .restart local v9    # "openRequest":Lcom/facebook/Session$OpenRequest;
    :cond_7
    :goto_3
    if-eqz v9, :cond_0

    .line 855
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    # getter for: Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    invoke-static {v13}, Lcom/facebook/widget/LoginButton;->access$1000(Lcom/facebook/widget/LoginButton;)Lcom/facebook/widget/LoginButton$LoginButtonProperties;

    move-result-object v13

    # getter for: Lcom/facebook/widget/LoginButton$LoginButtonProperties;->defaultAudience:Lcom/facebook/SessionDefaultAudience;
    invoke-static {v13}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->access$1100(Lcom/facebook/widget/LoginButton$LoginButtonProperties;)Lcom/facebook/SessionDefaultAudience;

    move-result-object v13

    invoke-virtual {v9, v13}, Lcom/facebook/Session$OpenRequest;->setDefaultAudience(Lcom/facebook/SessionDefaultAudience;)Lcom/facebook/Session$OpenRequest;

    .line 856
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    # getter for: Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    invoke-static {v13}, Lcom/facebook/widget/LoginButton;->access$1000(Lcom/facebook/widget/LoginButton;)Lcom/facebook/widget/LoginButton$LoginButtonProperties;

    move-result-object v13

    # getter for: Lcom/facebook/widget/LoginButton$LoginButtonProperties;->permissions:Ljava/util/List;
    invoke-static {v13}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->access$1200(Lcom/facebook/widget/LoginButton$LoginButtonProperties;)Ljava/util/List;

    move-result-object v13

    invoke-virtual {v9, v13}, Lcom/facebook/Session$OpenRequest;->setPermissions(Ljava/util/List;)Lcom/facebook/Session$OpenRequest;

    .line 857
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    # getter for: Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    invoke-static {v13}, Lcom/facebook/widget/LoginButton;->access$1000(Lcom/facebook/widget/LoginButton;)Lcom/facebook/widget/LoginButton$LoginButtonProperties;

    move-result-object v13

    # getter for: Lcom/facebook/widget/LoginButton$LoginButtonProperties;->loginBehavior:Lcom/facebook/SessionLoginBehavior;
    invoke-static {v13}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->access$1300(Lcom/facebook/widget/LoginButton$LoginButtonProperties;)Lcom/facebook/SessionLoginBehavior;

    move-result-object v13

    invoke-virtual {v9, v13}, Lcom/facebook/Session$OpenRequest;->setLoginBehavior(Lcom/facebook/SessionLoginBehavior;)Lcom/facebook/Session$OpenRequest;

    .line 859
    sget-object v13, Lcom/facebook/internal/SessionAuthorizationType;->PUBLISH:Lcom/facebook/internal/SessionAuthorizationType;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/facebook/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/widget/LoginButton;

    # getter for: Lcom/facebook/widget/LoginButton;->properties:Lcom/facebook/widget/LoginButton$LoginButtonProperties;
    invoke-static {v14}, Lcom/facebook/widget/LoginButton;->access$1000(Lcom/facebook/widget/LoginButton;)Lcom/facebook/widget/LoginButton$LoginButtonProperties;

    move-result-object v14

    # getter for: Lcom/facebook/widget/LoginButton$LoginButtonProperties;->authorizationType:Lcom/facebook/internal/SessionAuthorizationType;
    invoke-static {v14}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->access$1400(Lcom/facebook/widget/LoginButton$LoginButtonProperties;)Lcom/facebook/internal/SessionAuthorizationType;

    move-result-object v14

    invoke-virtual {v13, v14}, Lcom/facebook/internal/SessionAuthorizationType;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    .line 860
    invoke-virtual {v5, v9}, Lcom/facebook/Session;->openForPublish(Lcom/facebook/Session$OpenRequest;)V

    goto/16 :goto_1

    .line 845
    .restart local v4    # "context":Landroid/content/Context;
    :cond_8
    instance-of v13, v4, Landroid/app/Activity;

    if-eqz v13, :cond_9

    .line 846
    new-instance v9, Lcom/facebook/Session$OpenRequest;

    .end local v9    # "openRequest":Lcom/facebook/Session$OpenRequest;
    check-cast v4, Landroid/app/Activity;

    .end local v4    # "context":Landroid/content/Context;
    invoke-direct {v9, v4}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/app/Activity;)V

    .restart local v9    # "openRequest":Lcom/facebook/Session$OpenRequest;
    goto :goto_3

    .line 847
    .restart local v4    # "context":Landroid/content/Context;
    :cond_9
    instance-of v13, v4, Landroid/content/ContextWrapper;

    if-eqz v13, :cond_7

    .line 848
    check-cast v4, Landroid/content/ContextWrapper;

    .end local v4    # "context":Landroid/content/Context;
    invoke-virtual {v4}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    .line 849
    .local v1, "baseContext":Landroid/content/Context;
    instance-of v13, v1, Landroid/app/Activity;

    if-eqz v13, :cond_7

    .line 850
    new-instance v9, Lcom/facebook/Session$OpenRequest;

    .end local v9    # "openRequest":Lcom/facebook/Session$OpenRequest;
    check-cast v1, Landroid/app/Activity;

    .end local v1    # "baseContext":Landroid/content/Context;
    invoke-direct {v9, v1}, Lcom/facebook/Session$OpenRequest;-><init>(Landroid/app/Activity;)V

    .restart local v9    # "openRequest":Lcom/facebook/Session$OpenRequest;
    goto :goto_3

    .line 862
    :cond_a
    invoke-virtual {v5, v9}, Lcom/facebook/Session;->openForRead(Lcom/facebook/Session$OpenRequest;)V

    goto/16 :goto_1

    .line 871
    .end local v5    # "currentSession":Lcom/facebook/Session;
    .end local v9    # "openRequest":Lcom/facebook/Session$OpenRequest;
    .restart local v6    # "logger":Lcom/facebook/AppEventsLogger;
    .restart local v11    # "parameters":Landroid/os/Bundle;
    :cond_b
    const/4 v13, 0x1

    goto/16 :goto_2
.end method
