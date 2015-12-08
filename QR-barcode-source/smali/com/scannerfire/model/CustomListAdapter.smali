.class public Lcom/scannerfire/model/CustomListAdapter;
.super Landroid/widget/BaseAdapter;
.source "CustomListAdapter.java"

# interfaces
.implements Landroid/widget/Filterable;


# static fields
.field private static synthetic $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE:[I


# instance fields
.field a:Landroid/app/Activity;

.field date:Landroid/widget/TextView;

.field image:Landroid/widget/ImageView;

.field inflater:Landroid/view/LayoutInflater;

.field m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/scannerfire/model/QRModel;",
            ">;"
        }
    .end annotation
.end field

.field resource:I

.field scan:Landroid/widget/TextView;

.field time:Landroid/widget/TextView;


# direct methods
.method static synthetic $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()[I
    .locals 3

    .prologue
    .line 32
    sget-object v0, Lcom/scannerfire/model/CustomListAdapter;->$SWITCH_TABLE$com$scannerfire$utils$Utils$MODE:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/scannerfire/utils/Utils$MODE;->values()[Lcom/scannerfire/utils/Utils$MODE;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_calendar:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_8

    :goto_1
    :try_start_1
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_contact:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_7

    :goto_2
    :try_start_2
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_email:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_6

    :goto_3
    :try_start_3
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_geo:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_5

    :goto_4
    :try_start_4
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_isbn:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/16 v2, 0x9

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :goto_5
    :try_start_5
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_phone:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_3

    :goto_6
    :try_start_6
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_product:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_2

    :goto_7
    :try_start_7
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_text:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_1

    :goto_8
    :try_start_8
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_url:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_0

    :goto_9
    sput-object v0, Lcom/scannerfire/model/CustomListAdapter;->$SWITCH_TABLE$com$scannerfire$utils$Utils$MODE:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_9

    :catch_1
    move-exception v1

    goto :goto_8

    :catch_2
    move-exception v1

    goto :goto_7

    :catch_3
    move-exception v1

    goto :goto_6

    :catch_4
    move-exception v1

    goto :goto_5

    :catch_5
    move-exception v1

    goto :goto_4

    :catch_6
    move-exception v1

    goto :goto_3

    :catch_7
    move-exception v1

    goto :goto_2

    :catch_8
    move-exception v1

    goto :goto_1
.end method

.method public constructor <init>(Landroid/app/Activity;ILjava/util/ArrayList;)V
    .locals 1
    .param p1, "a"    # Landroid/app/Activity;
    .param p2, "resource"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "I",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/scannerfire/model/QRModel;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 42
    .local p3, "m":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/scannerfire/model/QRModel;>;"
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/scannerfire/model/CustomListAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 43
    iput-object p1, p0, Lcom/scannerfire/model/CustomListAdapter;->a:Landroid/app/Activity;

    .line 44
    iput p2, p0, Lcom/scannerfire/model/CustomListAdapter;->resource:I

    .line 45
    iput-object p3, p0, Lcom/scannerfire/model/CustomListAdapter;->m:Ljava/util/ArrayList;

    .line 48
    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 47
    iput-object v0, p0, Lcom/scannerfire/model/CustomListAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 49
    return-void
.end method

.method private getTextFromMode(Lcom/scannerfire/utils/Utils$MODE;Ljava/lang/String;Lcom/google/zxing/Result;)Ljava/lang/String;
    .locals 13
    .param p1, "m"    # Lcom/scannerfire/utils/Utils$MODE;
    .param p2, "s"    # Ljava/lang/String;
    .param p3, "r"    # Lcom/google/zxing/Result;

    .prologue
    .line 127
    const-string v8, ""

    .line 128
    .local v8, "str":Ljava/lang/String;
    invoke-static {}, Lcom/scannerfire/model/CustomListAdapter;->$SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()[I

    move-result-object v10

    invoke-virtual {p1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v11

    aget v10, v10, v11

    packed-switch v10, :pswitch_data_0

    .line 200
    :cond_0
    :goto_0
    return-object v8

    .line 130
    :pswitch_0
    const-string v10, "BIZCARD:"

    invoke-virtual {p2, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_1

    .line 131
    invoke-static {p2}, Lcom/scannerfire/model/BizCard;->getBizCardFromString(Ljava/lang/String;)Lcom/scannerfire/model/BizCard;

    invoke-static {}, Lcom/scannerfire/model/BizCard;->getString()Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 133
    :cond_1
    const-string v8, ""

    .line 134
    invoke-static/range {p3 .. p3}, Lcom/scannerfire/utils/Utils;->makeBundle(Lcom/google/zxing/Result;)Landroid/os/Bundle;

    move-result-object v0

    .line 135
    .local v0, "bundle":Landroid/os/Bundle;
    if-eqz v0, :cond_0

    .line 136
    const-string v10, "extraData"

    invoke-virtual {v0, v10}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    .line 137
    .local v2, "extraData":Landroid/os/Bundle;
    if-eqz v2, :cond_0

    .line 138
    const-string v10, "names"

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 139
    .local v5, "names":[Ljava/lang/String;
    if-eqz v5, :cond_2

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v11, 0x0

    aget-object v11, v5, v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 140
    :cond_2
    const-string v10, "phones"

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 141
    .local v7, "phones":[Ljava/lang/String;
    if-eqz v7, :cond_3

    .line 142
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_1
    array-length v10, v7

    if-lt v3, v10, :cond_7

    .line 146
    .end local v3    # "i":I
    :cond_3
    const-string v10, "emails"

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 147
    .local v1, "emails":[Ljava/lang/String;
    if-eqz v1, :cond_4

    .line 148
    const/4 v3, 0x0

    .restart local v3    # "i":I
    :goto_2
    array-length v10, v1

    if-lt v3, v10, :cond_8

    .line 151
    .end local v3    # "i":I
    :cond_4
    const-string v10, "org"

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 152
    .local v6, "org":Ljava/lang/String;
    if-eqz v6, :cond_5

    .line 153
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 154
    :cond_5
    const-string v10, "title"

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 155
    .local v9, "title":Ljava/lang/String;
    if-eqz v6, :cond_6

    .line 156
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 157
    :cond_6
    const-string v10, "indirizzi"

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 158
    .local v4, "indirizzi":[Ljava/lang/String;
    if-eqz v4, :cond_0

    .line 159
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v11, 0x0

    aget-object v11, v4, v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "\n"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 163
    goto/16 :goto_0

    .line 143
    .end local v1    # "emails":[Ljava/lang/String;
    .end local v4    # "indirizzi":[Ljava/lang/String;
    .end local v6    # "org":Ljava/lang/String;
    .end local v9    # "title":Ljava/lang/String;
    .restart local v3    # "i":I
    :cond_7
    const-string v10, ""

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "Phone "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, ":"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    aget-object v12, v7, v3

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 144
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v11, v7, v3

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 142
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_1

    .line 149
    .restart local v1    # "emails":[Ljava/lang/String;
    :cond_8
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v11, v1, v3

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 148
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_2

    .line 165
    .end local v0    # "bundle":Landroid/os/Bundle;
    .end local v1    # "emails":[Ljava/lang/String;
    .end local v2    # "extraData":Landroid/os/Bundle;
    .end local v3    # "i":I
    .end local v5    # "names":[Ljava/lang/String;
    .end local v7    # "phones":[Ljava/lang/String;
    :pswitch_1
    const-string v10, "MATMSG:"

    invoke-virtual {p2, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_9

    .line 166
    invoke-static {p2}, Lcom/scannerfire/model/MatMsg;->getMatMsgFromString(Ljava/lang/String;)Lcom/scannerfire/model/MatMsg;

    invoke-static {}, Lcom/scannerfire/model/MatMsg;->getString()Ljava/lang/String;

    move-result-object v8

    goto/16 :goto_0

    .line 168
    :cond_9
    invoke-static {p2}, Lcom/scannerfire/model/Mail;->getMailFromString(Ljava/lang/String;)Lcom/scannerfire/model/Mail;

    invoke-static {}, Lcom/scannerfire/model/Mail;->getString()Ljava/lang/String;

    move-result-object v8

    .line 169
    goto/16 :goto_0

    .line 171
    :pswitch_2
    move-object v8, p2

    .line 172
    const-string v10, "geo:"

    invoke-virtual {v8, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_a

    const-string v10, "geo:"

    const-string v11, ""

    invoke-virtual {v8, v10, v11}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 173
    :cond_a
    const-string v10, "GEO:"

    invoke-virtual {v8, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_b

    const-string v10, "GEO:"

    const-string v11, ""

    invoke-virtual {v8, v10, v11}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 174
    :cond_b
    goto/16 :goto_0

    .line 176
    :pswitch_3
    move-object v8, p2

    .line 177
    goto/16 :goto_0

    .line 179
    :pswitch_4
    move-object v8, p2

    .line 180
    goto/16 :goto_0

    .line 182
    :pswitch_5
    move-object v8, p2

    .line 183
    const-string v10, "uri:"

    invoke-virtual {p2, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_c

    const-string v10, "uri:"

    const-string v11, ""

    invoke-virtual {p2, v10, v11}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 184
    :cond_c
    const-string v10, "URI:"

    invoke-virtual {p2, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_0

    const-string v10, "URI:"

    const-string v11, ""

    invoke-virtual {p2, v10, v11}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 185
    goto/16 :goto_0

    .line 187
    :pswitch_6
    move-object v8, p2

    .line 188
    goto/16 :goto_0

    .line 190
    :pswitch_7
    move-object v8, p2

    .line 191
    invoke-static/range {p3 .. p3}, Lcom/scannerfire/utils/Utils;->makeBundle(Lcom/google/zxing/Result;)Landroid/os/Bundle;

    move-result-object v0

    .line 192
    .restart local v0    # "bundle":Landroid/os/Bundle;
    if-eqz v0, :cond_0

    .line 193
    const-string v10, "label"

    invoke-virtual {v0, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 195
    goto/16 :goto_0

    .line 197
    .end local v0    # "bundle":Landroid/os/Bundle;
    :pswitch_8
    move-object v8, p2

    goto/16 :goto_0

    .line 128
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_3
        :pswitch_7
        :pswitch_6
        :pswitch_8
    .end packed-switch
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/scannerfire/model/CustomListAdapter;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    .prologue
    .line 256
    new-instance v0, Lcom/scannerfire/model/CustomListAdapter$2;

    invoke-direct {v0, p0}, Lcom/scannerfire/model/CustomListAdapter$2;-><init>(Lcom/scannerfire/model/CustomListAdapter;)V

    .line 300
    .local v0, "filter":Landroid/widget/Filter;
    return-object v0
.end method

.method public getItem(I)Lcom/scannerfire/model/QRModel;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 60
    iget-object v0, p0, Lcom/scannerfire/model/CustomListAdapter;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scannerfire/model/QRModel;

    return-object v0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/scannerfire/model/CustomListAdapter;->getItem(I)Lcom/scannerfire/model/QRModel;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "arg0"    # I

    .prologue
    .line 123
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 69
    const-string v4, ""

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Dentro getView POS: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    move-object v3, p2

    .line 72
    .local v3, "v":Landroid/view/View;
    if-nez v3, :cond_0

    .line 73
    iget-object v4, p0, Lcom/scannerfire/model/CustomListAdapter;->inflater:Landroid/view/LayoutInflater;

    iget v5, p0, Lcom/scannerfire/model/CustomListAdapter;->resource:I

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 75
    :cond_0
    move-object v2, v3

    .line 76
    .local v2, "row":Landroid/view/View;
    const v4, 0x7f0d00d5

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iput-object v4, p0, Lcom/scannerfire/model/CustomListAdapter;->scan:Landroid/widget/TextView;

    .line 77
    const v4, 0x7f0d00d6

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iput-object v4, p0, Lcom/scannerfire/model/CustomListAdapter;->date:Landroid/widget/TextView;

    .line 78
    const v4, 0x7f0d00d7

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iput-object v4, p0, Lcom/scannerfire/model/CustomListAdapter;->time:Landroid/widget/TextView;

    .line 79
    const v4, 0x7f0d0074

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lcom/scannerfire/model/CustomListAdapter;->image:Landroid/widget/ImageView;

    .line 81
    iget-object v4, p0, Lcom/scannerfire/model/CustomListAdapter;->m:Ljava/util/ArrayList;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scannerfire/model/QRModel;

    .line 84
    .local v1, "model":Lcom/scannerfire/model/QRModel;
    invoke-virtual {v1}, Lcom/scannerfire/model/QRModel;->getResult()Lcom/google/zxing/Result;

    move-result-object v4

    invoke-static {v4}, Lcom/google/zxing/client/result/ResultParser;->parseResult(Lcom/google/zxing/Result;)Lcom/google/zxing/client/result/ParsedResult;

    move-result-object v4

    .line 83
    invoke-static {v4}, Lcom/scannerfire/utils/ResultParser;->getParsedResult(Lcom/google/zxing/client/result/ParsedResult;)Lcom/scannerfire/utils/Utils$MODE;

    move-result-object v0

    .line 88
    .local v0, "mode":Lcom/scannerfire/utils/Utils$MODE;
    iget-object v4, p0, Lcom/scannerfire/model/CustomListAdapter;->scan:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/scannerfire/model/QRModel;->getResult()Lcom/google/zxing/Result;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/scannerfire/model/QRModel;->getResult()Lcom/google/zxing/Result;

    move-result-object v6

    invoke-direct {p0, v0, v5, v6}, Lcom/scannerfire/model/CustomListAdapter;->getTextFromMode(Lcom/scannerfire/utils/Utils$MODE;Ljava/lang/String;Lcom/google/zxing/Result;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    iget-object v4, p0, Lcom/scannerfire/model/CustomListAdapter;->time:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/scannerfire/model/QRModel;->getTime()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    iget-object v4, p0, Lcom/scannerfire/model/CustomListAdapter;->date:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/scannerfire/model/QRModel;->getDate()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    new-instance v4, Lcom/scannerfire/model/CustomListAdapter$1;

    invoke-direct {v4, p0, v1, v2, p1}, Lcom/scannerfire/model/CustomListAdapter$1;-><init>(Lcom/scannerfire/model/CustomListAdapter;Lcom/scannerfire/model/QRModel;Landroid/view/View;I)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 112
    iget-object v4, p0, Lcom/scannerfire/model/CustomListAdapter;->m:Ljava/util/ArrayList;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/scannerfire/model/QRModel;

    invoke-virtual {v4}, Lcom/scannerfire/model/QRModel;->getId()I

    move-result v4

    invoke-static {}, Lcom/scannerfire/utils/Utils;->getLastElem()I

    move-result v5

    if-eq v4, v5, :cond_1

    .line 113
    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    const/4 v5, -0x1

    invoke-direct {v4, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 116
    :goto_0
    return-object v2

    .line 114
    :cond_1
    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    iget-object v5, p0, Lcom/scannerfire/model/CustomListAdapter;->a:Landroid/app/Activity;

    invoke-virtual {v5}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f09002a

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-direct {v4, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method public remove(I)V
    .locals 4
    .param p1, "item"    # I

    .prologue
    .line 238
    const-string v1, ""

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ITEM IS "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 241
    new-instance v0, Lcom/scannerfire/db/DbAdapter;

    iget-object v1, p0, Lcom/scannerfire/model/CustomListAdapter;->a:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/scannerfire/db/DbAdapter;-><init>(Landroid/content/Context;)V

    .line 242
    .local v0, "dbAdapter":Lcom/scannerfire/db/DbAdapter;
    invoke-virtual {v0}, Lcom/scannerfire/db/DbAdapter;->open()Lcom/scannerfire/db/DbAdapter;

    .line 243
    iget-object v1, p0, Lcom/scannerfire/model/CustomListAdapter;->m:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scannerfire/model/QRModel;

    invoke-virtual {v1}, Lcom/scannerfire/model/QRModel;->getId()I

    move-result v1

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/scannerfire/db/DbAdapter;->deleteRecord(J)Z

    .line 244
    invoke-virtual {v0}, Lcom/scannerfire/db/DbAdapter;->close()V

    .line 250
    iget-object v1, p0, Lcom/scannerfire/model/CustomListAdapter;->m:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 252
    return-void
.end method
