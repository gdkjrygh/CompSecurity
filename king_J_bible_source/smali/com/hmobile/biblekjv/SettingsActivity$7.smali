.class Lcom/hmobile/biblekjv/SettingsActivity$7;
.super Ljava/lang/Object;
.source "SettingsActivity.java"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/SettingsActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/SettingsActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/SettingsActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/SettingsActivity$7;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    .line 244
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 3
    .param p1, "buttonView"    # Landroid/widget/CompoundButton;
    .param p2, "isChecked"    # Z

    .prologue
    .line 249
    iget-object v0, p0, Lcom/hmobile/biblekjv/SettingsActivity$7;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SettingsActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "navigation_fade"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 250
    iget-object v0, p0, Lcom/hmobile/biblekjv/SettingsActivity$7;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SettingsActivity;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 251
    if-eqz p2, :cond_0

    .line 252
    iget-object v0, p0, Lcom/hmobile/biblekjv/SettingsActivity$7;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    # getter for: Lcom/hmobile/biblekjv/SettingsActivity;->txtNavigationLabel:Landroid/widget/TextView;
    invoke-static {v0}, Lcom/hmobile/biblekjv/SettingsActivity;->access$2(Lcom/hmobile/biblekjv/SettingsActivity;)Landroid/widget/TextView;

    move-result-object v0

    .line 253
    iget-object v1, p0, Lcom/hmobile/biblekjv/SettingsActivity$7;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/SettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 254
    const v2, 0x7f070070

    .line 253
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 262
    :goto_0
    return-void

    .line 256
    :cond_0
    iget-object v0, p0, Lcom/hmobile/biblekjv/SettingsActivity$7;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    # getter for: Lcom/hmobile/biblekjv/SettingsActivity;->txtNavigationLabel:Landroid/widget/TextView;
    invoke-static {v0}, Lcom/hmobile/biblekjv/SettingsActivity;->access$2(Lcom/hmobile/biblekjv/SettingsActivity;)Landroid/widget/TextView;

    move-result-object v0

    .line 257
    iget-object v1, p0, Lcom/hmobile/biblekjv/SettingsActivity$7;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/SettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 259
    const v2, 0x7f070071

    .line 258
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 257
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method
