.class public Lcom/kik/view/adapters/ContactsCursorAdapter;
.super Landroid/support/v4/widget/CursorAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/ContactsCursorAdapter$a;
    }
.end annotation


# instance fields
.field protected final a:Lcom/kik/cache/ad;

.field protected final b:Lcom/kik/android/a;

.field protected final c:Lkik/a/e/r;

.field private final d:Landroid/view/LayoutInflater;

.field private final e:Z

.field private final f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/database/Cursor;ZZLcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v4/widget/CursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;I)V

    .line 36
    iput-boolean p3, p0, Lcom/kik/view/adapters/ContactsCursorAdapter;->e:Z

    .line 37
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/view/adapters/ContactsCursorAdapter;->d:Landroid/view/LayoutInflater;

    .line 38
    iput-boolean p4, p0, Lcom/kik/view/adapters/ContactsCursorAdapter;->f:Z

    .line 39
    iput-object p5, p0, Lcom/kik/view/adapters/ContactsCursorAdapter;->a:Lcom/kik/cache/ad;

    .line 40
    iput-object p7, p0, Lcom/kik/view/adapters/ContactsCursorAdapter;->b:Lcom/kik/android/a;

    .line 41
    iput-object p6, p0, Lcom/kik/view/adapters/ContactsCursorAdapter;->c:Lkik/a/e/r;

    .line 42
    return-void
.end method


# virtual methods
.method protected a()I
    .locals 1

    .prologue
    .line 46
    const v0, 0x7f03006e

    return v0
.end method

.method public bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 11

    .prologue
    const v7, 0x7f090346

    const/16 v8, 0x8

    const/4 v3, 0x0

    const/4 v5, -0x1

    .line 69
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/kik/view/adapters/ContactsCursorAdapter$a;

    .line 70
    const-string v0, "suggest_intent_data_id"

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 71
    if-ne v0, v5, :cond_0

    .line 100
    :goto_0
    return-void

    .line 75
    :cond_0
    const-string v1, "suggest_text_1"

    invoke-interface {p3, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    .line 76
    const-string v2, "suggest_text_2"

    invoke-interface {p3, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    .line 77
    invoke-interface {p3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 79
    if-eq v1, v5, :cond_2

    invoke-interface {p3, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v9, v0

    .line 80
    :goto_1
    if-eq v2, v5, :cond_3

    invoke-interface {p3, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    .line 82
    :goto_2
    iput-object v4, v6, Lcom/kik/view/adapters/ContactsCursorAdapter$a;->a:Ljava/lang/String;

    .line 84
    iget-object v0, p0, Lcom/kik/view/adapters/ContactsCursorAdapter;->c:Lkik/a/e/r;

    const/4 v1, 0x1

    invoke-interface {v0, v4, v1}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v10

    .line 86
    iget-boolean v0, p0, Lcom/kik/view/adapters/ContactsCursorAdapter;->f:Z

    if-eqz v0, :cond_4

    .line 87
    iget-object v0, v6, Lcom/kik/view/adapters/ContactsCursorAdapter$a;->b:Lcom/kik/cache/ContactImageView;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/kik/view/adapters/ContactsCursorAdapter;->a:Lcom/kik/cache/ad;

    iget-object v4, p0, Lcom/kik/view/adapters/ContactsCursorAdapter;->c:Lkik/a/e/r;

    iget-object v5, p0, Lcom/kik/view/adapters/ContactsCursorAdapter;->b:Lcom/kik/android/a;

    invoke-virtual/range {v0 .. v5}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/k;Lcom/kik/cache/ad;ZLkik/a/e/r;Lcom/kik/android/a;)V

    .line 93
    :goto_3
    iget-object v0, v6, Lcom/kik/view/adapters/ContactsCursorAdapter$a;->c:Landroid/widget/ImageView;

    invoke-virtual {v10}, Lkik/a/d/k;->i()Z

    move-result v1

    if-eqz v1, :cond_5

    :goto_4
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 94
    iget-object v0, v6, Lcom/kik/view/adapters/ContactsCursorAdapter$a;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    iget-object v0, v6, Lcom/kik/view/adapters/ContactsCursorAdapter$a;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    iget-object v0, v6, Lcom/kik/view/adapters/ContactsCursorAdapter$a;->g:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 97
    iget-object v0, v6, Lcom/kik/view/adapters/ContactsCursorAdapter$a;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 99
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AUTOMATION_SELECT_USER_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_0

    .line 79
    :cond_2
    invoke-virtual {p2, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v9, v0

    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {p2, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_2

    .line 90
    :cond_4
    iget-object v0, v6, Lcom/kik/view/adapters/ContactsCursorAdapter$a;->b:Lcom/kik/cache/ContactImageView;

    iget-object v2, p0, Lcom/kik/view/adapters/ContactsCursorAdapter;->a:Lcom/kik/cache/ad;

    iget-object v4, p0, Lcom/kik/view/adapters/ContactsCursorAdapter;->c:Lkik/a/e/r;

    iget-object v5, p0, Lcom/kik/view/adapters/ContactsCursorAdapter;->b:Lcom/kik/android/a;

    move-object v1, v10

    invoke-virtual/range {v0 .. v5}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/k;Lcom/kik/cache/ad;ZLkik/a/e/r;Lcom/kik/android/a;)V

    goto :goto_3

    :cond_5
    move v3, v8

    .line 93
    goto :goto_4
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .prologue
    .line 55
    invoke-virtual {p0}, Lcom/kik/view/adapters/ContactsCursorAdapter;->getCursor()Landroid/database/Cursor;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/kik/view/adapters/ContactsCursorAdapter;->getCursor()Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 56
    if-eqz p2, :cond_0

    .line 63
    :goto_0
    return-object p2

    .line 60
    :cond_0
    iget-object v0, p0, Lcom/kik/view/adapters/ContactsCursorAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/kik/view/adapters/ContactsCursorAdapter;->getCursor()Landroid/database/Cursor;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p3}, Lcom/kik/view/adapters/ContactsCursorAdapter;->newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    .line 63
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/widget/CursorAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    goto :goto_0
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 145
    const/4 v0, 0x1

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 138
    invoke-virtual {p0}, Lcom/kik/view/adapters/ContactsCursorAdapter;->getCount()I

    move-result v0

    .line 139
    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/kik/view/adapters/ContactsCursorAdapter;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 114
    iget-object v0, p0, Lcom/kik/view/adapters/ContactsCursorAdapter;->d:Landroid/view/LayoutInflater;

    invoke-virtual {p0}, Lcom/kik/view/adapters/ContactsCursorAdapter;->a()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 116
    new-instance v2, Lcom/kik/view/adapters/ContactsCursorAdapter$a;

    invoke-direct {v2}, Lcom/kik/view/adapters/ContactsCursorAdapter$a;-><init>()V

    .line 118
    const v0, 0x7f0e0167

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ContactImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/ContactsCursorAdapter$a;->b:Lcom/kik/cache/ContactImageView;

    .line 119
    const v0, 0x7f0e0168

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/ContactsCursorAdapter$a;->c:Landroid/widget/ImageView;

    .line 120
    const v0, 0x7f0e016a

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/kik/view/adapters/ContactsCursorAdapter$a;->d:Landroid/widget/TextView;

    .line 121
    const v0, 0x7f0e016b

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/kik/view/adapters/ContactsCursorAdapter$a;->e:Landroid/widget/TextView;

    .line 123
    const v0, 0x7f0e016c

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 124
    if-eqz v0, :cond_0

    .line 125
    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/ContactsCursorAdapter$a;->f:Landroid/widget/ImageView;

    .line 128
    :cond_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 130
    return-object v1
.end method
