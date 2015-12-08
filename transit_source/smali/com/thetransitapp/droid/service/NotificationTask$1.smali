.class Lcom/thetransitapp/droid/service/NotificationTask$1;
.super Ljava/lang/Object;
.source "NotificationTask.java"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/service/NotificationTask;-><init>(Landroid/content/Context;Landroid/location/Location;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/service/NotificationTask;

.field private final synthetic val$alertDialog:Landroid/app/AlertDialog;

.field private final synthetic val$emailPattern:Ljava/util/regex/Pattern;

.field private final synthetic val$input:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/service/NotificationTask;Landroid/app/AlertDialog;Landroid/widget/EditText;Ljava/util/regex/Pattern;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/service/NotificationTask$1;->this$0:Lcom/thetransitapp/droid/service/NotificationTask;

    iput-object p2, p0, Lcom/thetransitapp/droid/service/NotificationTask$1;->val$alertDialog:Landroid/app/AlertDialog;

    iput-object p3, p0, Lcom/thetransitapp/droid/service/NotificationTask$1;->val$input:Landroid/widget/EditText;

    iput-object p4, p0, Lcom/thetransitapp/droid/service/NotificationTask$1;->val$emailPattern:Ljava/util/regex/Pattern;

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/thetransitapp/droid/service/NotificationTask$1;)Lcom/thetransitapp/droid/service/NotificationTask;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/thetransitapp/droid/service/NotificationTask$1;->this$0:Lcom/thetransitapp/droid/service/NotificationTask;

    return-object v0
.end method


# virtual methods
.method public onShow(Landroid/content/DialogInterface;)V
    .locals 5
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 69
    iget-object v1, p0, Lcom/thetransitapp/droid/service/NotificationTask$1;->val$alertDialog:Landroid/app/AlertDialog;

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v0

    .line 70
    .local v0, "okButton":Landroid/widget/Button;
    new-instance v1, Lcom/thetransitapp/droid/service/NotificationTask$1$1;

    iget-object v2, p0, Lcom/thetransitapp/droid/service/NotificationTask$1;->val$input:Landroid/widget/EditText;

    iget-object v3, p0, Lcom/thetransitapp/droid/service/NotificationTask$1;->val$emailPattern:Ljava/util/regex/Pattern;

    iget-object v4, p0, Lcom/thetransitapp/droid/service/NotificationTask$1;->val$alertDialog:Landroid/app/AlertDialog;

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/thetransitapp/droid/service/NotificationTask$1$1;-><init>(Lcom/thetransitapp/droid/service/NotificationTask$1;Landroid/widget/EditText;Ljava/util/regex/Pattern;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    return-void
.end method
