.class Lcom/hmobile/biblekjv/MainBookActivity$14;
.super Ljava/lang/Object;
.source "MainBookActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/MainBookActivity;->ShowAlertForSetting()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/widget/AdapterView$OnItemSelectedListener;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/MainBookActivity;

.field private final synthetic val$editor:Landroid/content/SharedPreferences$Editor;

.field private final synthetic val$f_size:[I


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MainBookActivity;Landroid/content/SharedPreferences$Editor;[I)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity$14;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iput-object p2, p0, Lcom/hmobile/biblekjv/MainBookActivity$14;->val$editor:Landroid/content/SharedPreferences$Editor;

    iput-object p3, p0, Lcom/hmobile/biblekjv/MainBookActivity$14;->val$f_size:[I

    .line 1455
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
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
    .line 1461
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity$14;->val$editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "font_size"

    iget-object v2, p0, Lcom/hmobile/biblekjv/MainBookActivity$14;->val$f_size:[I

    aget v2, v2, p3

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 1462
    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 1467
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    return-void
.end method
