.class final Lcom/localytics/android/AmpCondition;
.super Ljava/lang/Object;
.source "AmpCondition.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/localytics/android/AmpCondition$1;,
        Lcom/localytics/android/AmpCondition$Opt;
    }
.end annotation


# instance fields
.field private mName:Ljava/lang/String;

.field private mOpt:Lcom/localytics/android/AmpCondition$Opt;

.field private mPkgName:Ljava/lang/String;

.field private mValues:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;)V
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "operator"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Vector",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 48
    .local p3, "values":Ljava/util/Vector;, "Ljava/util/Vector<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/localytics/android/AmpCondition;->mName:Ljava/lang/String;

    .line 50
    invoke-direct {p0, p2}, Lcom/localytics/android/AmpCondition;->stringToOperator(Ljava/lang/String;)Lcom/localytics/android/AmpCondition$Opt;

    move-result-object v0

    iput-object v0, p0, Lcom/localytics/android/AmpCondition;->mOpt:Lcom/localytics/android/AmpCondition$Opt;

    .line 51
    iput-object p3, p0, Lcom/localytics/android/AmpCondition;->mValues:Ljava/util/Vector;

    .line 52
    return-void
.end method

.method private isSatisfiedByNumber(Ljava/lang/String;)Z
    .locals 10
    .param p1, "attributeValue"    # Ljava/lang/String;

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 150
    const/4 v5, 0x0

    .line 153
    .local v5, "satisfied":Z
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 154
    .local v0, "attribute":Ljava/math/BigDecimal;
    new-instance v9, Ljava/math/BigDecimal;

    iget-object v6, p0, Lcom/localytics/android/AmpCondition;->mValues:Ljava/util/Vector;

    invoke-virtual {v6, v7}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-direct {v9, v6}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v3

    .line 155
    .local v3, "result1":I
    iget-object v6, p0, Lcom/localytics/android/AmpCondition;->mValues:Ljava/util/Vector;

    invoke-virtual {v6}, Ljava/util/Vector;->size()I

    move-result v6

    if-le v6, v8, :cond_1

    new-instance v9, Ljava/math/BigDecimal;

    iget-object v6, p0, Lcom/localytics/android/AmpCondition;->mValues:Ljava/util/Vector;

    invoke-virtual {v6, v8}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-direct {v9, v6}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v4

    .line 157
    .local v4, "result2":I
    :goto_0
    sget-object v6, Lcom/localytics/android/AmpCondition$1;->$SwitchMap$com$localytics$android$AmpCondition$Opt:[I

    iget-object v9, p0, Lcom/localytics/android/AmpCondition;->mOpt:Lcom/localytics/android/AmpCondition$Opt;

    invoke-virtual {v9}, Lcom/localytics/android/AmpCondition$Opt;->ordinal()I

    move-result v9

    aget v6, v6, v9

    packed-switch v6, :pswitch_data_0

    .line 194
    :cond_0
    :goto_1
    return v5

    .end local v4    # "result2":I
    :cond_1
    move v4, v7

    .line 155
    goto :goto_0

    .line 160
    .restart local v4    # "result2":I
    :pswitch_0
    if-nez v3, :cond_2

    move v5, v8

    .line 161
    :goto_2
    goto :goto_1

    :cond_2
    move v5, v7

    .line 160
    goto :goto_2

    .line 163
    :pswitch_1
    if-eqz v3, :cond_3

    move v5, v8

    .line 164
    :goto_3
    goto :goto_1

    :cond_3
    move v5, v7

    .line 163
    goto :goto_3

    .line 166
    :pswitch_2
    if-lez v3, :cond_4

    move v5, v8

    .line 167
    :goto_4
    goto :goto_1

    :cond_4
    move v5, v7

    .line 166
    goto :goto_4

    .line 169
    :pswitch_3
    if-ltz v3, :cond_5

    move v5, v8

    .line 170
    :goto_5
    goto :goto_1

    :cond_5
    move v5, v7

    .line 169
    goto :goto_5

    .line 172
    :pswitch_4
    if-gez v3, :cond_6

    move v5, v8

    .line 173
    :goto_6
    goto :goto_1

    :cond_6
    move v5, v7

    .line 172
    goto :goto_6

    .line 175
    :pswitch_5
    if-gtz v3, :cond_7

    move v5, v8

    .line 176
    :goto_7
    goto :goto_1

    :cond_7
    move v5, v7

    .line 175
    goto :goto_7

    .line 178
    :pswitch_6
    if-ltz v3, :cond_8

    if-gtz v4, :cond_8

    move v5, v8

    .line 179
    :goto_8
    goto :goto_1

    :cond_8
    move v5, v7

    .line 178
    goto :goto_8

    .line 181
    :pswitch_7
    iget-object v6, p0, Lcom/localytics/android/AmpCondition;->mValues:Ljava/util/Vector;

    invoke-virtual {v6}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :cond_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 183
    .local v1, "conditionValue":Ljava/lang/String;
    new-instance v6, Ljava/math/BigDecimal;

    invoke-direct {v6, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v6

    if-nez v6, :cond_9

    .line 185
    const/4 v5, 0x1

    .line 186
    goto :goto_1

    .line 157
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_7
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private isSatisfiedByString(Ljava/lang/String;)Z
    .locals 6
    .param p1, "attributeValue"    # Ljava/lang/String;

    .prologue
    const/4 v3, 0x0

    .line 113
    const/4 v2, 0x0

    .line 115
    .local v2, "satisfied":Z
    sget-object v4, Lcom/localytics/android/AmpCondition$1;->$SwitchMap$com$localytics$android$AmpCondition$Opt:[I

    iget-object v5, p0, Lcom/localytics/android/AmpCondition;->mOpt:Lcom/localytics/android/AmpCondition$Opt;

    invoke-virtual {v5}, Lcom/localytics/android/AmpCondition$Opt;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    .line 142
    invoke-direct {p0, p1}, Lcom/localytics/android/AmpCondition;->isSatisfiedByNumber(Ljava/lang/String;)Z

    move-result v2

    .line 145
    :cond_0
    :goto_0
    return v2

    .line 118
    :pswitch_0
    iget-object v4, p0, Lcom/localytics/android/AmpCondition;->mValues:Ljava/util/Vector;

    invoke-virtual {v4, v3}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    .line 119
    goto :goto_0

    .line 121
    :pswitch_1
    iget-object v4, p0, Lcom/localytics/android/AmpCondition;->mValues:Ljava/util/Vector;

    invoke-virtual {v4, v3}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    const/4 v2, 0x1

    .line 122
    :goto_1
    goto :goto_0

    :cond_1
    move v2, v3

    .line 121
    goto :goto_1

    .line 124
    :pswitch_2
    iget-object v3, p0, Lcom/localytics/android/AmpCondition;->mValues:Ljava/util/Vector;

    invoke-virtual {v3}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 126
    .local v0, "conditionValue":Ljava/lang/String;
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 128
    const/4 v2, 0x1

    .line 129
    goto :goto_0

    .line 115
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private operatorToString(Lcom/localytics/android/AmpCondition$Opt;)Ljava/lang/String;
    .locals 2
    .param p1, "opt"    # Lcom/localytics/android/AmpCondition$Opt;

    .prologue
    .line 245
    sget-object v0, Lcom/localytics/android/AmpCondition$1;->$SwitchMap$com$localytics$android$AmpCondition$Opt:[I

    invoke-virtual {p1}, Lcom/localytics/android/AmpCondition$Opt;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 265
    const-string v0, "INVALID OPERATOR"

    :goto_0
    return-object v0

    .line 248
    :pswitch_0
    const-string v0, "is equal to"

    goto :goto_0

    .line 250
    :pswitch_1
    const-string v0, "not equal to"

    goto :goto_0

    .line 252
    :pswitch_2
    const-string v0, "is greater than"

    goto :goto_0

    .line 254
    :pswitch_3
    const-string v0, "is greater than or equal to"

    goto :goto_0

    .line 256
    :pswitch_4
    const-string v0, "is less than"

    goto :goto_0

    .line 258
    :pswitch_5
    const-string v0, "is less than or equal to"

    goto :goto_0

    .line 260
    :pswitch_6
    const-string v0, "is in between values"

    goto :goto_0

    .line 262
    :pswitch_7
    const-string v0, "is a member of the list"

    goto :goto_0

    .line 245
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_7
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private stringToOperator(Ljava/lang/String;)Lcom/localytics/android/AmpCondition$Opt;
    .locals 1
    .param p1, "operator"    # Ljava/lang/String;

    .prologue
    .line 199
    const-string v0, "eq"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 201
    sget-object v0, Lcom/localytics/android/AmpCondition$Opt;->EQUAL:Lcom/localytics/android/AmpCondition$Opt;

    .line 239
    :goto_0
    return-object v0

    .line 204
    :cond_0
    const-string v0, "neq"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 206
    sget-object v0, Lcom/localytics/android/AmpCondition$Opt;->NOT_EQUAL:Lcom/localytics/android/AmpCondition$Opt;

    goto :goto_0

    .line 209
    :cond_1
    const-string v0, "gt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 211
    sget-object v0, Lcom/localytics/android/AmpCondition$Opt;->GREATER_THAN:Lcom/localytics/android/AmpCondition$Opt;

    goto :goto_0

    .line 214
    :cond_2
    const-string v0, "gte"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 216
    sget-object v0, Lcom/localytics/android/AmpCondition$Opt;->GREATER_THEN_OR_EQUAL:Lcom/localytics/android/AmpCondition$Opt;

    goto :goto_0

    .line 219
    :cond_3
    const-string v0, "lt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 221
    sget-object v0, Lcom/localytics/android/AmpCondition$Opt;->LESS_THAN:Lcom/localytics/android/AmpCondition$Opt;

    goto :goto_0

    .line 224
    :cond_4
    const-string v0, "lte"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 226
    sget-object v0, Lcom/localytics/android/AmpCondition$Opt;->LESS_THAN_OR_EQUAL:Lcom/localytics/android/AmpCondition$Opt;

    goto :goto_0

    .line 229
    :cond_5
    const-string v0, "btw"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 231
    sget-object v0, Lcom/localytics/android/AmpCondition$Opt;->BETWEEN:Lcom/localytics/android/AmpCondition$Opt;

    goto :goto_0

    .line 234
    :cond_6
    const-string v0, "in"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 236
    sget-object v0, Lcom/localytics/android/AmpCondition$Opt;->IN_LIST:Lcom/localytics/android/AmpCondition$Opt;

    goto :goto_0

    .line 239
    :cond_7
    sget-object v0, Lcom/localytics/android/AmpCondition$Opt;->INVALID:Lcom/localytics/android/AmpCondition$Opt;

    goto :goto_0
.end method


# virtual methods
.method public isSatisfiedByAttributes(Ljava/util/Map;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .local p1, "attributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/4 v5, 0x1

    const/4 v2, 0x0

    .line 67
    if-nez p1, :cond_1

    move v1, v2

    .line 108
    :cond_0
    :goto_0
    return v1

    .line 73
    :cond_1
    iget-object v3, p0, Lcom/localytics/android/AmpCondition;->mName:Ljava/lang/String;

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 74
    .local v0, "attributeValue":Ljava/lang/Object;
    if-nez v0, :cond_2

    .line 76
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/localytics/android/AmpCondition;->mPkgName:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/localytics/android/AmpCondition;->mName:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 80
    :cond_2
    if-nez v0, :cond_4

    .line 82
    sget-boolean v3, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v3, :cond_3

    .line 84
    const-string v3, "Localytics"

    const-string v4, "Could not find the AMP condition %s in the attributes dictionary."

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/localytics/android/AmpCondition;->mName:Ljava/lang/String;

    aput-object v6, v5, v2

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    move v1, v2

    .line 86
    goto :goto_0

    .line 91
    :cond_4
    const/4 v1, 0x0

    .line 92
    .local v1, "satisfied":Z
    instance-of v3, v0, Ljava/lang/String;

    if-eqz v3, :cond_5

    .line 94
    check-cast v0, Ljava/lang/String;

    .end local v0    # "attributeValue":Ljava/lang/Object;
    invoke-direct {p0, v0}, Lcom/localytics/android/AmpCondition;->isSatisfiedByString(Ljava/lang/String;)Z

    move-result v1

    goto :goto_0

    .line 96
    .restart local v0    # "attributeValue":Ljava/lang/Object;
    :cond_5
    instance-of v3, v0, Ljava/lang/Number;

    if-eqz v3, :cond_6

    .line 98
    check-cast v0, Ljava/lang/String;

    .end local v0    # "attributeValue":Ljava/lang/Object;
    invoke-direct {p0, v0}, Lcom/localytics/android/AmpCondition;->isSatisfiedByNumber(Ljava/lang/String;)Z

    move-result v1

    goto :goto_0

    .line 102
    .restart local v0    # "attributeValue":Ljava/lang/Object;
    :cond_6
    sget-boolean v3, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v3, :cond_0

    .line 104
    const-string v3, "Localytics"

    const-string v4, "Invalid value type %s in the attributes dictionary."

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 0
    .param p1, "pkgName"    # Ljava/lang/String;

    .prologue
    .line 56
    iput-object p1, p0, Lcom/localytics/android/AmpCondition;->mPkgName:Ljava/lang/String;

    .line 57
    return-void
.end method
