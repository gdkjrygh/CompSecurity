.class final Lcom/roidapp/photogrid/video/ca;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/bp;

.field private b:Landroid/content/Context;

.field private c:[Lcom/roidapp/photogrid/release/ig;

.field private d:I


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/bp;Landroid/content/Context;[Lcom/roidapp/photogrid/release/ig;)V
    .locals 1

    .prologue
    .line 1020
    iput-object p1, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 1021
    iput-object p2, p0, Lcom/roidapp/photogrid/video/ca;->b:Landroid/content/Context;

    .line 1022
    iput-object p3, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    .line 1023
    const/high16 v0, -0x80000000

    iput v0, p0, Lcom/roidapp/photogrid/video/ca;->d:I

    .line 1024
    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 1

    .prologue
    .line 1067
    const/high16 v0, -0x80000000

    iput v0, p0, Lcom/roidapp/photogrid/video/ca;->d:I

    .line 1068
    return-void
.end method

.method protected final a(I)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x0

    .line 1071
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-lt p1, v0, :cond_1

    .line 1098
    :cond_0
    :goto_0
    return-void

    .line 1076
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/bp;->e(Lcom/roidapp/photogrid/video/bp;)[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/bp;->e(Lcom/roidapp/photogrid/video/bp;)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    array-length v2, v2

    sub-int/2addr v2, p1

    add-int/lit8 v2, v2, -0x1

    invoke-static {v0, p1, v1, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1077
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/bp;->e(Lcom/roidapp/photogrid/video/bp;)[Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aput-object v5, v0, v1

    .line 1078
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    new-array v0, v0, [Ljava/lang/String;

    .line 1079
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/bp;->e(Lcom/roidapp/photogrid/video/bp;)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v1, v6, v0, v6, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1080
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/video/bp;->a(Lcom/roidapp/photogrid/video/bp;[Ljava/lang/String;)[Ljava/lang/String;

    .line 1082
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    .line 1083
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    add-int/lit8 v2, p1, 0x1

    iget-object v3, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    add-int/lit8 v0, v0, -0x1

    sub-int v4, v0, p1

    invoke-static {v1, v2, v3, p1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1084
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    aput-object v5, v1, v0

    .line 1086
    new-array v1, v0, [Lcom/roidapp/photogrid/release/ig;

    .line 1087
    iget-object v2, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    invoke-static {v2, v6, v1, v6, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1088
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/bp;->a(Lcom/roidapp/photogrid/video/bp;[Lcom/roidapp/photogrid/release/ig;)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    .line 1089
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/bp;->c(Lcom/roidapp/photogrid/video/bp;)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 1090
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/bp;->c(Lcom/roidapp/photogrid/video/bp;)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0x32

    if-ge v0, v1, :cond_2

    .line 1091
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/bp;->d(Lcom/roidapp/photogrid/video/bp;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/bp;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c00bf

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1092
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/bp;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020359

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 1093
    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 1094
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/bp;->d(Lcom/roidapp/photogrid/video/bp;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v5, v0, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 1097
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/ca;->notifyDataSetChanged()V

    goto/16 :goto_0
.end method

.method protected final a(II)V
    .locals 5

    .prologue
    .line 1048
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-lt p2, v0, :cond_1

    .line 1064
    :cond_0
    :goto_0
    return-void

    .line 1052
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, p1

    .line 1054
    if-ge p1, p2, :cond_3

    .line 1055
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    add-int/lit8 v2, p1, 0x1

    iget-object v3, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    sub-int v4, p2, p1

    invoke-static {v1, v2, v3, p1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1060
    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    aput-object v0, v1, p2

    .line 1062
    iput p2, p0, Lcom/roidapp/photogrid/video/ca;->d:I

    .line 1063
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/ca;->notifyDataSetChanged()V

    goto :goto_0

    .line 1056
    :cond_3
    if-le p1, p2, :cond_2

    .line 1057
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    add-int/lit8 v3, p2, 0x1

    sub-int v4, p1, p2

    invoke-static {v1, p2, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1
.end method

.method protected final a(Lcom/roidapp/photogrid/release/ig;)V
    .locals 6

    .prologue
    const/16 v5, 0x32

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 1027
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [Lcom/roidapp/photogrid/release/ig;

    .line 1028
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    array-length v2, v2

    invoke-static {v1, v4, v0, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1029
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aput-object p1, v0, v1

    .line 1030
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/video/bp;->a(Lcom/roidapp/photogrid/video/bp;[Lcom/roidapp/photogrid/release/ig;)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    .line 1031
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/bp;->c(Lcom/roidapp/photogrid/video/bp;)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 1032
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/bp;->c(Lcom/roidapp/photogrid/video/bp;)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    array-length v0, v0

    if-lt v0, v5, :cond_0

    .line 1033
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/bp;->d(Lcom/roidapp/photogrid/video/bp;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/bp;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c00c0

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1034
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/bp;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020359

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 1035
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 1036
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/bp;->d(Lcom/roidapp/photogrid/video/bp;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v3, v0, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 1040
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/bp;->c(Lcom/roidapp/photogrid/video/bp;)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    array-length v0, v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/bp;->e(Lcom/roidapp/photogrid/video/bp;)[Ljava/lang/String;

    move-result-object v1

    array-length v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    .line 1041
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/bp;->e(Lcom/roidapp/photogrid/video/bp;)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/bp;->e(Lcom/roidapp/photogrid/video/bp;)[Ljava/lang/String;

    move-result-object v2

    array-length v2, v2

    iget-object v3, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v3}, Lcom/roidapp/photogrid/video/bp;->c(Lcom/roidapp/photogrid/video/bp;)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v3

    array-length v3, v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v1, v4, v0, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1042
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/video/bp;->a(Lcom/roidapp/photogrid/video/bp;[Ljava/lang/String;)[Ljava/lang/String;

    .line 1044
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/ca;->notifyDataSetChanged()V

    .line 1045
    return-void
.end method

.method public final b(I)Lcom/roidapp/photogrid/release/ig;
    .locals 1

    .prologue
    .line 1110
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-lt p1, v0, :cond_1

    .line 1111
    :cond_0
    const/4 v0, 0x0

    .line 1113
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, p1

    goto :goto_0
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 1102
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    if-nez v0, :cond_0

    .line 1103
    const/4 v0, 0x0

    .line 1105
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->c:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    goto :goto_0
.end method

.method public final synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1012
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/video/ca;->b(I)Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 1118
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1124
    if-nez p2, :cond_0

    .line 1125
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ca;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030131

    invoke-virtual {v0, v1, p3, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 1127
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 1128
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/bp;->f(Lcom/roidapp/photogrid/video/bp;)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1130
    new-instance v1, Lcom/roidapp/photogrid/video/cb;

    invoke-direct {v1}, Lcom/roidapp/photogrid/video/cb;-><init>()V

    .line 1131
    const v0, 0x7f0d0175

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/photogrid/video/cb;->a:Landroid/widget/ImageView;

    .line 1132
    const v0, 0x7f0d04dd

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v1, Lcom/roidapp/photogrid/video/cb;->c:Landroid/widget/RelativeLayout;

    .line 1133
    iget-object v0, v1, Lcom/roidapp/photogrid/video/cb;->c:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1134
    const v0, 0x7f0d04db

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/photogrid/video/cb;->b:Landroid/widget/TextView;

    .line 1147
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v0, v1

    .line 1152
    :goto_0
    iget v1, p0, Lcom/roidapp/photogrid/video/ca;->d:I

    if-ne p1, v1, :cond_1

    .line 1153
    const/4 v1, 0x4

    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1158
    :goto_1
    iget-object v1, v0, Lcom/roidapp/photogrid/video/cb;->c:Landroid/widget/RelativeLayout;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 1159
    iget-object v1, v0, Lcom/roidapp/photogrid/video/cb;->b:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1160
    iget-object v1, v0, Lcom/roidapp/photogrid/video/cb;->b:Landroid/widget/TextView;

    add-int/lit8 v2, p1, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1163
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v1}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/video/cc;

    invoke-direct {v2}, Lcom/roidapp/photogrid/video/cc;-><init>()V

    const-class v3, Landroid/graphics/Bitmap;

    invoke-virtual {v1, v2, v3}, Lcom/bumptech/glide/p;->a(Lcom/bumptech/glide/load/c/s;Ljava/lang/Class;)Lcom/bumptech/glide/r;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/video/ca;->b(I)Lcom/roidapp/photogrid/release/ig;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/r;->a(Ljava/lang/Object;)Lcom/bumptech/glide/s;

    move-result-object v1

    const-class v2, Landroid/graphics/Bitmap;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/s;->a(Ljava/lang/Class;)Lcom/bumptech/glide/g;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/video/bm;

    iget-object v3, p0, Lcom/roidapp/photogrid/video/ca;->b:Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/roidapp/photogrid/video/bm;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/g;->a(Lcom/bumptech/glide/load/e;)Lcom/bumptech/glide/e;

    move-result-object v1

    sget-object v2, Lcom/bumptech/glide/load/b/e;->b:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/e;->b(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/e;->e()Lcom/bumptech/glide/e;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/e;->a(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/e;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/bp;->f(Lcom/roidapp/photogrid/video/bp;)I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/photogrid/video/ca;->a:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v3}, Lcom/roidapp/photogrid/video/bp;->f(Lcom/roidapp/photogrid/video/bp;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/bumptech/glide/e;->a(II)Lcom/bumptech/glide/e;

    move-result-object v1

    iget-object v0, v0, Lcom/roidapp/photogrid/video/cb;->a:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/e;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 1186
    return-object p2

    .line 1149
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/cb;

    goto :goto_0

    .line 1155
    :cond_1
    invoke-virtual {p2, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1
.end method
