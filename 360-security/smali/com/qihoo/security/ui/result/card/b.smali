.class public Lcom/qihoo/security/ui/result/card/b;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method public static a(I)Lcom/qihoo/security/ui/result/card/a;
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v3, 0x0

    .line 32
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 33
    invoke-static {}, Lcom/qihoo/security/ui/result/d;->a()Lcom/qihoo/security/ui/result/d;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/qihoo/security/ui/result/d;->a(I)Z

    move-result v2

    .line 34
    const/4 v1, 0x0

    .line 35
    packed-switch p0, :pswitch_data_0

    :cond_0
    :pswitch_0
    move v0, v2

    .line 174
    :goto_0
    if-eqz v1, :cond_1

    .line 175
    iput-boolean v0, v1, Lcom/qihoo/security/ui/result/card/a;->e:Z

    .line 176
    iget-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->h:Ljava/lang/Object;

    if-nez v0, :cond_1

    .line 177
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v2, 0x7f0c00e5

    invoke-virtual {v0, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->h:Ljava/lang/Object;

    .line 180
    :cond_1
    return-object v1

    .line 77
    :pswitch_1
    new-instance v1, Lcom/qihoo/security/ui/result/card/c;

    invoke-direct {v1}, Lcom/qihoo/security/ui/result/card/c;-><init>()V

    .line 78
    const v4, 0x7f080003

    iput v4, v1, Lcom/qihoo/security/ui/result/card/a;->b:I

    .line 79
    const v4, 0x7f020058

    iput v4, v1, Lcom/qihoo/security/ui/result/card/a;->c:I

    .line 80
    const-string/jumbo v4, "sp_key_clear_prescan_total_count"

    invoke-static {v0, v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 81
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v2, v3

    .line 84
    :cond_2
    if-eqz v2, :cond_4

    .line 85
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0xa

    if-le v4, v5, :cond_3

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v4

    const v5, 0x7f0c00db

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v0, v6, v3

    invoke-virtual {v4, v5, v6}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 88
    :goto_1
    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->f:Ljava/lang/Object;

    .line 89
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v3, 0x7f0c00cf

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->h:Ljava/lang/Object;

    move-object v0, v1

    .line 90
    check-cast v0, Lcom/qihoo/security/ui/result/card/c;

    invoke-static {}, Lcom/qihoo/security/ui/result/d;->a()Lcom/qihoo/security/ui/result/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/qihoo/security/ui/result/d;->f()Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, v0, Lcom/qihoo/security/ui/result/card/c;->i:Ljava/util/ArrayList;

    move v0, v2

    .line 91
    goto :goto_0

    .line 85
    :cond_3
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v4

    const v5, 0x7f0c00dc

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v0, v6, v3

    invoke-virtual {v4, v5, v6}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 92
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "RecommendType."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v3, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Clean:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    invoke-virtual {v3}, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 93
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v3

    const v4, 0x7f0c00da

    invoke-virtual {v3, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/qihoo/security/ui/result/card/a;->f:Ljava/lang/Object;

    .line 94
    invoke-static {}, Lcom/qihoo/security/recommend/RecommendHelper;->a()Lcom/qihoo/security/recommend/RecommendHelper;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/qihoo/security/recommend/RecommendHelper;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->g:Ljava/lang/Object;

    move v0, v2

    .line 96
    goto/16 :goto_0

    .line 98
    :pswitch_2
    new-instance v1, Lcom/qihoo/security/ui/result/card/a;

    invoke-direct {v1}, Lcom/qihoo/security/ui/result/card/a;-><init>()V

    .line 99
    const v0, 0x7f080004

    iput v0, v1, Lcom/qihoo/security/ui/result/card/a;->b:I

    .line 100
    const v0, 0x7f020057

    iput v0, v1, Lcom/qihoo/security/ui/result/card/a;->c:I

    .line 101
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v3, 0x7f0c00d0

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->f:Ljava/lang/Object;

    .line 102
    invoke-static {}, Lcom/qihoo/security/ui/result/d;->a()Lcom/qihoo/security/ui/result/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/d;->e()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->g:Ljava/lang/Object;

    .line 103
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v3, 0x7f0c00dd

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->h:Ljava/lang/Object;

    move v0, v2

    .line 104
    goto/16 :goto_0

    .line 106
    :pswitch_3
    new-instance v1, Lcom/qihoo/security/ui/result/card/c;

    invoke-direct {v1}, Lcom/qihoo/security/ui/result/card/c;-><init>()V

    .line 107
    const v3, 0x7f080005

    iput v3, v1, Lcom/qihoo/security/ui/result/card/a;->b:I

    .line 108
    const v3, 0x7f02005a

    iput v3, v1, Lcom/qihoo/security/ui/result/card/a;->c:I

    .line 109
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v3

    const v4, 0x7f0c0254

    invoke-virtual {v3, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lcom/qihoo/security/ui/result/card/a;->f:Ljava/lang/Object;

    .line 110
    const v3, 0x7f0c00e4

    invoke-static {v0}, Lcom/qihoo/security/ui/result/g;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v5, 0x7f090072

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const/high16 v5, -0x10000

    invoke-static {v3, v4, v0, v5}, Lcom/qihoo360/mobilesafe/b/n;->a(ILjava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->g:Ljava/lang/Object;

    .line 113
    if-eqz v2, :cond_0

    move-object v0, v1

    .line 114
    check-cast v0, Lcom/qihoo/security/ui/result/card/c;

    invoke-static {}, Lcom/qihoo/security/ui/result/d;->a()Lcom/qihoo/security/ui/result/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/qihoo/security/ui/result/d;->g()Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, v0, Lcom/qihoo/security/ui/result/card/c;->i:Ljava/util/ArrayList;

    move v0, v2

    goto/16 :goto_0

    .line 125
    :pswitch_4
    new-instance v1, Lcom/qihoo/security/ui/result/card/a;

    invoke-direct {v1}, Lcom/qihoo/security/ui/result/card/a;-><init>()V

    .line 126
    const v0, 0x7f080006

    iput v0, v1, Lcom/qihoo/security/ui/result/card/a;->b:I

    .line 127
    const v0, 0x7f020059

    iput v0, v1, Lcom/qihoo/security/ui/result/card/a;->c:I

    .line 128
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v4, 0x7f0c00e0

    invoke-virtual {v0, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->f:Ljava/lang/Object;

    .line 129
    invoke-static {}, Lcom/qihoo/security/ui/result/d;->a()Lcom/qihoo/security/ui/result/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/d;->d()Ljava/lang/String;

    move-result-object v0

    .line 130
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v4

    const v5, 0x7f0c00e1

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v0, v6, v3

    invoke-virtual {v4, v5, v6}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->g:Ljava/lang/Object;

    .line 131
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v3, 0x7f0c00e2

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->h:Ljava/lang/Object;

    move v0, v2

    .line 132
    goto/16 :goto_0

    .line 134
    :pswitch_5
    new-instance v1, Lcom/qihoo/security/ui/result/card/c;

    invoke-direct {v1}, Lcom/qihoo/security/ui/result/card/c;-><init>()V

    .line 135
    invoke-static {}, Lcom/qihoo/security/ui/result/d;->a()Lcom/qihoo/security/ui/result/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/d;->b()Ljava/util/ArrayList;

    move-result-object v4

    .line 136
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_7

    move-object v0, v1

    .line 137
    check-cast v0, Lcom/qihoo/security/ui/result/card/c;

    iput-object v4, v0, Lcom/qihoo/security/ui/result/card/c;->i:Ljava/util/ArrayList;

    .line 138
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/card/c$a;

    iget v0, v0, Lcom/qihoo/security/ui/result/card/c$a;->h:I

    .line 139
    if-ne v0, v6, :cond_6

    .line 140
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v3, 0x7f0c0093

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->g:Ljava/lang/Object;

    .line 141
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v3, 0x7f0c0096

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->h:Ljava/lang/Object;

    .line 149
    :cond_5
    :goto_2
    const v0, 0x7f08000b

    iput v0, v1, Lcom/qihoo/security/ui/result/card/a;->b:I

    .line 150
    const v0, 0x7f02008d

    iput v0, v1, Lcom/qihoo/security/ui/result/card/a;->c:I

    .line 151
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v3, 0x7f0c00a0

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->f:Ljava/lang/Object;

    move v0, v2

    .line 152
    goto/16 :goto_0

    .line 142
    :cond_6
    if-nez v0, :cond_5

    .line 143
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v3, 0x7f0c0092

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->g:Ljava/lang/Object;

    .line 144
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v3, 0x7f0c0095

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->h:Ljava/lang/Object;

    goto :goto_2

    .line 147
    :cond_7
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v3, 0x7f0c0094

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo/security/ui/result/card/a;->g:Ljava/lang/Object;

    goto :goto_2

    .line 35
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_5
    .end packed-switch
.end method
