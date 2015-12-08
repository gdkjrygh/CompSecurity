.class Lcom/hmobile/biblekjv/BaseActivity$10;
.super Ljava/lang/Object;
.source "BaseActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/BaseActivity;->onBackPressed()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/BaseActivity;

.field private final synthetic val$editor:Landroid/content/SharedPreferences$Editor;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/BaseActivity;Landroid/content/SharedPreferences$Editor;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/BaseActivity$10;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    iput-object p2, p0, Lcom/hmobile/biblekjv/BaseActivity$10;->val$editor:Landroid/content/SharedPreferences$Editor;

    .line 712
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 717
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$10;->val$editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "exit_alert"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 718
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$10;->val$editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 719
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$10;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/BaseActivity;->finish()V

    .line 721
    return-void
.end method
