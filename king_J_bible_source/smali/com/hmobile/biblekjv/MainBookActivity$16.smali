.class Lcom/hmobile/biblekjv/MainBookActivity$16;
.super Ljava/lang/Object;
.source "MainBookActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/MainBookActivity;->ShowAlertForSetting()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/MainBookActivity;

.field private final synthetic val$dialog:Landroid/app/AlertDialog;

.field private final synthetic val$editor:Landroid/content/SharedPreferences$Editor;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MainBookActivity;Landroid/content/SharedPreferences$Editor;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity$16;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iput-object p2, p0, Lcom/hmobile/biblekjv/MainBookActivity$16;->val$editor:Landroid/content/SharedPreferences$Editor;

    iput-object p3, p0, Lcom/hmobile/biblekjv/MainBookActivity$16;->val$dialog:Landroid/app/AlertDialog;

    .line 1488
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 1492
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$16;->val$editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1493
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$16;->val$dialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 1494
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$16;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/MainBookActivity;->loadData()V

    .line 1495
    return-void
.end method
