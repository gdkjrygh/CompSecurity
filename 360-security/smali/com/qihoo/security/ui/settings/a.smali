.class public Lcom/qihoo/security/ui/settings/a;
.super Lcom/qihoo/security/c/a/a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/qihoo/security/c/a/a",
        "<",
        "Lcom/qihoo/security/locale/LocaleInfo;",
        ">;"
    }
.end annotation


# instance fields
.field private c:Ljava/lang/String;

.field private final d:Lcom/qihoo/security/locale/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/locale/LocaleInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/c/a/a;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 40
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/a;->c:Ljava/lang/String;

    .line 45
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/a;->d:Lcom/qihoo/security/locale/d;

    .line 46
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/a;->c()V

    .line 47
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 50
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/a;->c()V

    .line 51
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/a;->notifyDataSetChanged()V

    .line 52
    return-void
.end method

.method protected a(Landroid/view/View;ILandroid/view/ViewGroup;)V
    .locals 8

    .prologue
    const v7, 0x7f020126

    const v6, 0x7f020125

    const v5, 0x7f0200ba

    .line 119
    const v0, 0x7f0b017f

    invoke-static {p1, v0}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 120
    const v1, 0x7f0b0023

    invoke-static {p1, v1}, Lcom/qihoo/security/app/f;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 122
    invoke-virtual {p0, p2}, Lcom/qihoo/security/ui/settings/a;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo/security/locale/LocaleInfo;

    .line 124
    iget-object v3, p0, Lcom/qihoo/security/ui/settings/a;->c:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string/jumbo v3, ""

    :goto_0
    iput-object v3, p0, Lcom/qihoo/security/ui/settings/a;->c:Ljava/lang/String;

    .line 126
    iget-boolean v3, v2, Lcom/qihoo/security/locale/LocaleInfo;->buildin:Z

    if-eqz v3, :cond_2

    .line 127
    iget-object v3, p0, Lcom/qihoo/security/ui/settings/a;->c:Ljava/lang/String;

    iget-object v4, v2, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 128
    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 146
    :goto_1
    iget-object v1, v2, Lcom/qihoo/security/locale/LocaleInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 147
    return-void

    .line 124
    :cond_0
    iget-object v3, p0, Lcom/qihoo/security/ui/settings/a;->c:Ljava/lang/String;

    goto :goto_0

    .line 130
    :cond_1
    invoke-virtual {v1, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 132
    :cond_2
    iget-boolean v3, v2, Lcom/qihoo/security/locale/LocaleInfo;->support:Z

    if-eqz v3, :cond_3

    .line 133
    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 135
    :cond_3
    iget v3, v2, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_4

    .line 136
    const v3, 0x7f0200bb

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 137
    :cond_4
    iget v3, v2, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_5

    .line 138
    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 139
    :cond_5
    iget-object v3, p0, Lcom/qihoo/security/ui/settings/a;->c:Ljava/lang/String;

    iget-object v4, v2, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 140
    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 142
    :cond_6
    invoke-virtual {v1, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1
.end method

.method protected b()I
    .locals 1

    .prologue
    .line 114
    const v0, 0x7f030072

    return v0
.end method

.method public c()V
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 56
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/a;->d:Lcom/qihoo/security/locale/d;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/d;->g()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/a;->a:Ljava/util/List;

    .line 58
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/a;->a:Ljava/util/List;

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/a;->a:Ljava/util/List;

    .line 64
    :cond_0
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/locale/d;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/a;->c:Ljava/lang/String;

    .line 69
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v2

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/LocaleInfo;

    .line 70
    iget-object v5, v0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    invoke-static {v5}, Lcom/qihoo/security/locale/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v0, Lcom/qihoo/security/locale/LocaleInfo;->name:Ljava/lang/String;

    .line 71
    iget-object v5, p0, Lcom/qihoo/security/ui/settings/a;->c:Ljava/lang/String;

    iget-object v0, v0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    move v0, v3

    :goto_1
    move v1, v0

    .line 74
    goto :goto_0

    .line 76
    :cond_1
    if-eqz v1, :cond_2

    .line 77
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/a;->b:Landroid/content/Context;

    const-string/jumbo v1, "language"

    const-string/jumbo v4, ""

    invoke-static {v0, v1, v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    :cond_2
    new-instance v0, Lcom/qihoo/security/locale/LocaleInfo;

    const-string/jumbo v1, ""

    invoke-direct {v0, v1}, Lcom/qihoo/security/locale/LocaleInfo;-><init>(Ljava/lang/String;)V

    .line 82
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/a;->d:Lcom/qihoo/security/locale/d;

    const v4, 0x7f0c0166

    invoke-virtual {v1, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/locale/LocaleInfo;->name:Ljava/lang/String;

    .line 83
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/a;->a:Ljava/util/List;

    invoke-interface {v1, v3, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 86
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 87
    sget-object v0, Lcom/qihoo/security/env/a;->e:[Ljava/lang/String;

    array-length v4, v0

    :goto_2
    if-ge v3, v4, :cond_3

    aget-object v5, v0, v3

    .line 88
    invoke-virtual {v1, v5, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 92
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/LocaleInfo;

    .line 93
    iget-object v4, v0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 94
    iget-object v0, v0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 99
    :cond_5
    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 100
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 101
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 102
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 106
    new-instance v3, Lcom/qihoo/security/locale/LocaleInfo;

    invoke-direct {v3, v0, v2}, Lcom/qihoo/security/locale/LocaleInfo;-><init>(Ljava/lang/String;Z)V

    .line 107
    invoke-static {v0}, Lcom/qihoo/security/locale/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/qihoo/security/locale/LocaleInfo;->name:Ljava/lang/String;

    .line 108
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/a;->a:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 110
    :cond_6
    return-void

    :cond_7
    move v0, v1

    goto/16 :goto_1
.end method
