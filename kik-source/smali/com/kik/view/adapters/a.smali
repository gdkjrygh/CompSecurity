.class public final Lcom/kik/view/adapters/a;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/a$a;
    }
.end annotation


# instance fields
.field protected final a:Landroid/view/LayoutInflater;

.field protected b:I

.field protected c:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2

    .prologue
    .line 45
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kik/view/adapters/a;->c:Ljava/util/ArrayList;

    .line 46
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/view/adapters/a;->a:Landroid/view/LayoutInflater;

    .line 47
    iput p2, p0, Lcom/kik/view/adapters/a;->b:I

    .line 48
    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/kik/view/adapters/a;->c:Ljava/util/ArrayList;

    const-string v1, "FIND PEOPLE"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    :cond_0
    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_1

    .line 52
    iget-object v0, p0, Lcom/kik/view/adapters/a;->c:Ljava/util/ArrayList;

    const-string v1, "START GROUP"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    :cond_1
    and-int/lit8 v0, p2, 0x4

    if-eqz v0, :cond_2

    .line 55
    iget-object v0, p0, Lcom/kik/view/adapters/a;->c:Ljava/util/ArrayList;

    const-string v1, "EXPLICIT SEARCH"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    :cond_2
    and-int/lit8 v0, p2, 0x20

    if-eqz v0, :cond_3

    .line 58
    iget-object v0, p0, Lcom/kik/view/adapters/a;->c:Ljava/util/ArrayList;

    const-string v1, "SHOW KIK CODE SCANNER"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    :cond_3
    and-int/lit8 v0, p2, 0x8

    if-eqz v0, :cond_4

    .line 61
    iget-object v0, p0, Lcom/kik/view/adapters/a;->c:Ljava/util/ArrayList;

    const-string v1, "SHARE PROFILE"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    :cond_4
    and-int/lit8 v0, p2, 0x10

    if-eqz v0, :cond_5

    .line 64
    iget-object v0, p0, Lcom/kik/view/adapters/a;->c:Ljava/util/ArrayList;

    const-string v1, "PROMOTED CHATS"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    :cond_5
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/kik/view/adapters/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/kik/view/adapters/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 145
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 72
    if-nez p2, :cond_1

    .line 73
    iget-object v0, p0, Lcom/kik/view/adapters/a;->a:Landroid/view/LayoutInflater;

    const v1, 0x7f030061

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 74
    new-instance v1, Lcom/kik/view/adapters/a$a;

    invoke-direct {v1}, Lcom/kik/view/adapters/a$a;-><init>()V

    .line 75
    const v0, 0x7f0e0141

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/kik/view/adapters/a$a;->b:Landroid/widget/TextView;

    .line 76
    const v0, 0x7f0e0140

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/kik/view/adapters/a$a;->a:Landroid/widget/ImageView;

    .line 77
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 83
    :goto_0
    iget-object v0, p0, Lcom/kik/view/adapters/a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 84
    const-string v2, "FIND PEOPLE"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 85
    iget-object v0, v1, Lcom/kik/view/adapters/a$a;->b:Landroid/widget/TextView;

    const v2, 0x7f0900fb

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    iget-object v0, v1, Lcom/kik/view/adapters/a$a;->a:Landroid/widget/ImageView;

    const v1, 0x7f070001

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 87
    const-string v0, "AUTOMATION_FIND_PEOPLE_CELL"

    invoke-static {p2, v0}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 115
    :cond_0
    :goto_1
    return-object p2

    .line 80
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/a$a;

    move-object v1, v0

    goto :goto_0

    .line 89
    :cond_2
    const-string v2, "START GROUP"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 90
    iget-object v0, v1, Lcom/kik/view/adapters/a$a;->b:Landroid/widget/TextView;

    const v2, 0x7f0900f7

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    iget-object v0, v1, Lcom/kik/view/adapters/a$a;->a:Landroid/widget/ImageView;

    const v1, 0x7f070007

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 92
    const-string v0, "AUTOMATION_START_GROUP_CELL"

    invoke-static {p2, v0}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_1

    .line 94
    :cond_3
    const-string v2, "EXPLICIT SEARCH"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 95
    iget-object v0, v1, Lcom/kik/view/adapters/a$a;->b:Landroid/widget/TextView;

    const v2, 0x7f0900f3

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    iget-object v0, v1, Lcom/kik/view/adapters/a$a;->a:Landroid/widget/ImageView;

    const/high16 v1, 0x7f070000

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 97
    const-string v0, "AUTOMATION_EXPLICIT_SEARCH_CELL"

    invoke-static {p2, v0}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_1

    .line 99
    :cond_4
    const-string v2, "SHARE PROFILE"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 100
    iget-object v0, v1, Lcom/kik/view/adapters/a$a;->b:Landroid/widget/TextView;

    const v2, 0x7f0900f5

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    iget-object v0, v1, Lcom/kik/view/adapters/a$a;->a:Landroid/widget/ImageView;

    const v1, 0x7f070003

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 102
    const-string v0, "AUTOMATION_SHARE_PROFILE_CELL"

    invoke-static {p2, v0}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_1

    .line 104
    :cond_5
    const-string v2, "PROMOTED CHATS"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 105
    iget-object v0, v1, Lcom/kik/view/adapters/a$a;->b:Landroid/widget/TextView;

    const v2, 0x7f0900f2

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    iget-object v0, v1, Lcom/kik/view/adapters/a$a;->a:Landroid/widget/ImageView;

    const v1, 0x7f070002

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 107
    const-string v0, "AUTOMATION_PROMOTED_CHATS_CELL"

    invoke-static {p2, v0}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 109
    :cond_6
    const-string v2, "SHOW KIK CODE SCANNER"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, v1, Lcom/kik/view/adapters/a$a;->b:Landroid/widget/TextView;

    const v2, 0x7f090215

    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    iget-object v0, v1, Lcom/kik/view/adapters/a$a;->a:Landroid/widget/ImageView;

    const v1, 0x7f070006

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 112
    const-string v0, "AUTOMATION_SHOW_KIK_CODE_CELL"

    invoke-static {p2, v0}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_1
.end method

.method public final hasStableIds()Z
    .locals 1

    .prologue
    .line 151
    const/4 v0, 0x0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 157
    const/4 v0, 0x0

    return v0
.end method

.method public final registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 0

    .prologue
    .line 122
    return-void
.end method

.method public final unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 0

    .prologue
    .line 128
    return-void
.end method
