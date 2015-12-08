.class public Lcom/QRBS/activity/EmailList;
.super Lcom/actionbarsherlock/app/SherlockActivity;
.source "EmailList.java"


# instance fields
.field email_list:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation
.end field

.field lv:Landroid/widget/ListView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 26
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockActivity;->onCreate(Landroid/os/Bundle;)V

    .line 27
    const v3, 0x7f030029

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/EmailList;->setContentView(I)V

    .line 29
    invoke-virtual {p0}, Lcom/QRBS/activity/EmailList;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 30
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v3, 0x7f0200d4

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 31
    const v3, 0x7f0800b1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 32
    const v3, 0x7f0800d1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(I)V

    .line 33
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 35
    const v3, 0x7f0d0093

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/EmailList;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ListView;

    iput-object v3, p0, Lcom/QRBS/activity/EmailList;->lv:Landroid/widget/ListView;

    .line 36
    iget-object v3, p0, Lcom/QRBS/activity/EmailList;->lv:Landroid/widget/ListView;

    const v4, 0x7f0200e7

    invoke-virtual {v3, v4}, Landroid/widget/ListView;->setSelector(I)V

    .line 38
    invoke-virtual {p0}, Lcom/QRBS/activity/EmailList;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 39
    .local v2, "i":Landroid/content/Intent;
    const-string v3, "list"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getCharSequenceArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, p0, Lcom/QRBS/activity/EmailList;->email_list:Ljava/util/ArrayList;

    .line 41
    new-instance v1, Landroid/widget/ArrayAdapter;

    .line 43
    const v3, 0x1090003

    .line 44
    iget-object v4, p0, Lcom/QRBS/activity/EmailList;->email_list:Ljava/util/ArrayList;

    .line 41
    invoke-direct {v1, p0, v3, v4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 46
    .local v1, "arrayAdapter":Landroid/widget/ArrayAdapter;, "Landroid/widget/ArrayAdapter<Ljava/lang/CharSequence;>;"
    iget-object v3, p0, Lcom/QRBS/activity/EmailList;->lv:Landroid/widget/ListView;

    invoke-virtual {v3, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 48
    iget-object v3, p0, Lcom/QRBS/activity/EmailList;->lv:Landroid/widget/ListView;

    new-instance v4, Lcom/QRBS/activity/EmailList$1;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/EmailList$1;-><init>(Lcom/QRBS/activity/EmailList;)V

    invoke-virtual {v3, v4}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 59
    return-void
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 1
    .param p1, "menuitem"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 63
    invoke-virtual {p0}, Lcom/QRBS/activity/EmailList;->finish()V

    .line 64
    const/4 v0, 0x1

    return v0
.end method
