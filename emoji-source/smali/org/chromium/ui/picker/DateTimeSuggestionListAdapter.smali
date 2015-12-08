.class Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;
.super Landroid/widget/ArrayAdapter;
.source "DateTimeSuggestionListAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Lorg/chromium/ui/picker/DateTimeSuggestion;",
        ">;"
    }
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lorg/chromium/ui/picker/DateTimeSuggestion;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 25
    .local p2, "objects":Ljava/util/List;, "Ljava/util/List<Lorg/chromium/ui/picker/DateTimeSuggestion;>;"
    sget v0, Lorg/chromium/ui/R$layout;->date_time_suggestion:I

    invoke-direct {p0, p1, v0, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 26
    iput-object p1, p0, Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;->mContext:Landroid/content/Context;

    .line 27
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 52
    invoke-super {p0}, Landroid/widget/ArrayAdapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 31
    move-object v2, p2

    .line 32
    .local v2, "layout":Landroid/view/View;
    if-nez p2, :cond_0

    .line 33
    iget-object v4, p0, Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;->mContext:Landroid/content/Context;

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 34
    .local v0, "inflater":Landroid/view/LayoutInflater;
    sget v4, Lorg/chromium/ui/R$layout;->date_time_suggestion:I

    const/4 v5, 0x0

    invoke-virtual {v0, v4, p3, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 36
    .end local v0    # "inflater":Landroid/view/LayoutInflater;
    :cond_0
    sget v4, Lorg/chromium/ui/R$id;->date_time_suggestion_value:I

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 37
    .local v1, "labelView":Landroid/widget/TextView;
    sget v4, Lorg/chromium/ui/R$id;->date_time_suggestion_label:I

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 39
    .local v3, "sublabelView":Landroid/widget/TextView;
    invoke-virtual {p0}, Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;->getCount()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ne p1, v4, :cond_1

    .line 40
    iget-object v4, p0, Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;->mContext:Landroid/content/Context;

    sget v5, Lorg/chromium/ui/R$string;->date_picker_dialog_other_button_label:I

    invoke-virtual {v4, v5}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    const-string v4, ""

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    :goto_0
    return-object v2

    .line 43
    :cond_1
    invoke-virtual {p0, p1}, Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/chromium/ui/picker/DateTimeSuggestion;

    invoke-virtual {v4}, Lorg/chromium/ui/picker/DateTimeSuggestion;->localizedValue()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    invoke-virtual {p0, p1}, Lorg/chromium/ui/picker/DateTimeSuggestionListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/chromium/ui/picker/DateTimeSuggestion;

    invoke-virtual {v4}, Lorg/chromium/ui/picker/DateTimeSuggestion;->label()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method
