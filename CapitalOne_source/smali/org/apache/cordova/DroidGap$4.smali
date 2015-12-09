.class Lorg/apache/cordova/DroidGap$4;
.super Ljava/lang/Object;
.source "DroidGap.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/DroidGap;->displayError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/DroidGap;

.field final synthetic val$button:Ljava/lang/String;

.field final synthetic val$exit:Z

.field final synthetic val$me:Lorg/apache/cordova/DroidGap;

.field final synthetic val$message:Ljava/lang/String;

.field final synthetic val$title:Ljava/lang/String;


# direct methods
.method constructor <init>(Lorg/apache/cordova/DroidGap;Lorg/apache/cordova/DroidGap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .prologue
    .line 863
    iput-object p1, p0, Lorg/apache/cordova/DroidGap$4;->this$0:Lorg/apache/cordova/DroidGap;

    iput-object p2, p0, Lorg/apache/cordova/DroidGap$4;->val$me:Lorg/apache/cordova/DroidGap;

    iput-object p3, p0, Lorg/apache/cordova/DroidGap$4;->val$message:Ljava/lang/String;

    iput-object p4, p0, Lorg/apache/cordova/DroidGap$4;->val$title:Ljava/lang/String;

    iput-object p5, p0, Lorg/apache/cordova/DroidGap$4;->val$button:Ljava/lang/String;

    iput-boolean p6, p0, Lorg/apache/cordova/DroidGap$4;->val$exit:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 866
    :try_start_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lorg/apache/cordova/DroidGap$4;->val$me:Lorg/apache/cordova/DroidGap;

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 867
    .local v0, "dlg":Landroid/app/AlertDialog$Builder;
    iget-object v2, p0, Lorg/apache/cordova/DroidGap$4;->val$message:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 868
    iget-object v2, p0, Lorg/apache/cordova/DroidGap$4;->val$title:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 869
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 870
    iget-object v2, p0, Lorg/apache/cordova/DroidGap$4;->val$button:Ljava/lang/String;

    new-instance v3, Lorg/apache/cordova/DroidGap$4$1;

    invoke-direct {v3, p0}, Lorg/apache/cordova/DroidGap$4$1;-><init>(Lorg/apache/cordova/DroidGap$4;)V

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 879
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 880
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 884
    .end local v0    # "dlg":Landroid/app/AlertDialog$Builder;
    :goto_0
    return-void

    .line 881
    :catch_0
    move-exception v1

    .line 882
    .local v1, "e":Ljava/lang/Exception;
    iget-object v2, p0, Lorg/apache/cordova/DroidGap$4;->this$0:Lorg/apache/cordova/DroidGap;

    invoke-virtual {v2}, Lorg/apache/cordova/DroidGap;->finish()V

    goto :goto_0
.end method
