.class public final Lcom/google/zxing/client/android/result/AddressBookResultHandler;
.super Lcom/google/zxing/client/android/result/ResultHandler;
.source "AddressBookResultHandler.java"


# static fields
.field private static final BUTTON_TEXTS:[I

.field private static final DATE_FORMATS:[Ljava/text/DateFormat;


# instance fields
.field private buttonCount:I

.field private final fields:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .prologue
    const/4 v9, 0x4

    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v2, 0x0

    .line 42
    new-array v1, v9, [Ljava/text/DateFormat;

    .line 43
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyyMMdd"

    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v3, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    aput-object v3, v1, v2

    .line 44
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyyMMdd\'T\'HHmmss"

    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v3, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    aput-object v3, v1, v6

    .line 45
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyy-MM-dd"

    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v3, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    aput-object v3, v1, v7

    .line 46
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyy-MM-dd\'T\'HH:mm:ss"

    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v3, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    aput-object v3, v1, v8

    .line 42
    sput-object v1, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->DATE_FORMATS:[Ljava/text/DateFormat;

    .line 49
    sget-object v3, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->DATE_FORMATS:[Ljava/text/DateFormat;

    array-length v4, v3

    move v1, v2

    .local v0, "format":Ljava/text/DateFormat;
    :goto_0
    if-lt v1, v4, :cond_0

    .line 54
    new-array v1, v9, [I

    .line 55
    sget v3, Lcom/google/zxing/client/android/R$string;->button_add_contact:I

    aput v3, v1, v2

    .line 56
    sget v2, Lcom/google/zxing/client/android/R$string;->button_show_map:I

    aput v2, v1, v6

    .line 57
    sget v2, Lcom/google/zxing/client/android/R$string;->button_dial:I

    aput v2, v1, v7

    .line 58
    sget v2, Lcom/google/zxing/client/android/R$string;->button_email:I

    aput v2, v1, v8

    .line 54
    sput-object v1, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->BUTTON_TEXTS:[I

    .line 59
    return-void

    .line 49
    :cond_0
    aget-object v0, v3, v1

    .line 50
    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 49
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;)V
    .locals 12
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "result"    # Lcom/google/zxing/client/result/ParsedResult;

    .prologue
    const/4 v11, 0x4

    const/4 v8, 0x1

    const/4 v9, 0x0

    .line 82
    invoke-direct {p0, p1, p2}, Lcom/google/zxing/client/android/result/ResultHandler;-><init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;)V

    move-object v0, p2

    .line 83
    check-cast v0, Lcom/google/zxing/client/result/AddressBookParsedResult;

    .line 84
    .local v0, "addressResult":Lcom/google/zxing/client/result/AddressBookParsedResult;
    invoke-virtual {v0}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getAddresses()[Ljava/lang/String;

    move-result-object v1

    .line 85
    .local v1, "addresses":[Ljava/lang/String;
    if-eqz v1, :cond_0

    array-length v10, v1

    if-lez v10, :cond_0

    aget-object v10, v1, v9

    if-eqz v10, :cond_0

    aget-object v10, v1, v9

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    if-lez v10, :cond_0

    move v3, v8

    .line 86
    .local v3, "hasAddress":Z
    :goto_0
    invoke-virtual {v0}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getPhoneNumbers()[Ljava/lang/String;

    move-result-object v6

    .line 87
    .local v6, "phoneNumbers":[Ljava/lang/String;
    if-eqz v6, :cond_1

    array-length v10, v6

    if-lez v10, :cond_1

    move v5, v8

    .line 88
    .local v5, "hasPhoneNumber":Z
    :goto_1
    invoke-virtual {v0}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getEmails()[Ljava/lang/String;

    move-result-object v2

    .line 89
    .local v2, "emails":[Ljava/lang/String;
    if-eqz v2, :cond_2

    array-length v10, v2

    if-lez v10, :cond_2

    move v4, v8

    .line 91
    .local v4, "hasEmailAddress":Z
    :goto_2
    new-array v10, v11, [Z

    iput-object v10, p0, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->fields:[Z

    .line 92
    iget-object v10, p0, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->fields:[Z

    aput-boolean v8, v10, v9

    .line 93
    iget-object v10, p0, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->fields:[Z

    aput-boolean v3, v10, v8

    .line 94
    iget-object v8, p0, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->fields:[Z

    const/4 v10, 0x2

    aput-boolean v5, v8, v10

    .line 95
    iget-object v8, p0, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->fields:[Z

    const/4 v10, 0x3

    aput-boolean v4, v8, v10

    .line 97
    iput v9, p0, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->buttonCount:I

    .line 98
    const/4 v7, 0x0

    .local v7, "x":I
    :goto_3
    if-lt v7, v11, :cond_3

    .line 103
    return-void

    .end local v2    # "emails":[Ljava/lang/String;
    .end local v3    # "hasAddress":Z
    .end local v4    # "hasEmailAddress":Z
    .end local v5    # "hasPhoneNumber":Z
    .end local v6    # "phoneNumbers":[Ljava/lang/String;
    .end local v7    # "x":I
    :cond_0
    move v3, v9

    .line 85
    goto :goto_0

    .restart local v3    # "hasAddress":Z
    .restart local v6    # "phoneNumbers":[Ljava/lang/String;
    :cond_1
    move v5, v9

    .line 87
    goto :goto_1

    .restart local v2    # "emails":[Ljava/lang/String;
    .restart local v5    # "hasPhoneNumber":Z
    :cond_2
    move v4, v9

    .line 89
    goto :goto_2

    .line 99
    .restart local v4    # "hasEmailAddress":Z
    .restart local v7    # "x":I
    :cond_3
    iget-object v8, p0, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->fields:[Z

    aget-boolean v8, v8, v7

    if-eqz v8, :cond_4

    .line 100
    iget v8, p0, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->buttonCount:I

    add-int/lit8 v8, v8, 0x1

    iput v8, p0, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->buttonCount:I

    .line 98
    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_3
.end method

.method private mapIndexToAction(I)I
    .locals 3
    .param p1, "index"    # I

    .prologue
    .line 67
    iget v2, p0, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->buttonCount:I

    if-ge p1, v2, :cond_0

    .line 68
    const/4 v0, -0x1

    .line 69
    .local v0, "count":I
    const/4 v1, 0x0

    .local v1, "x":I
    :goto_0
    const/4 v2, 0x4

    if-lt v1, v2, :cond_2

    .line 78
    .end local v0    # "count":I
    .end local v1    # "x":I
    :cond_0
    const/4 v1, -0x1

    :cond_1
    return v1

    .line 70
    .restart local v0    # "count":I
    .restart local v1    # "x":I
    :cond_2
    iget-object v2, p0, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->fields:[Z

    aget-boolean v2, v2, v1

    if-eqz v2, :cond_3

    .line 71
    add-int/lit8 v0, v0, 0x1

    .line 73
    :cond_3
    if-eq v0, p1, :cond_1

    .line 69
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method private static parseDate(Ljava/lang/String;)Ljava/util/Date;
    .locals 5
    .param p0, "s"    # Ljava/lang/String;

    .prologue
    .line 159
    sget-object v2, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->DATE_FORMATS:[Ljava/text/DateFormat;

    array-length v3, v2

    const/4 v1, 0x0

    :goto_0
    if-lt v1, v3, :cond_0

    .line 166
    const/4 v1, 0x0

    :goto_1
    return-object v1

    .line 159
    :cond_0
    aget-object v0, v2, v1

    .line 161
    .local v0, "currentFormat":Ljava/text/DateFormat;
    :try_start_0
    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_1

    .line 162
    :catch_0
    move-exception v4

    .line 159
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method


# virtual methods
.method public getButtonCount()I
    .locals 1

    .prologue
    .line 107
    iget v0, p0, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->buttonCount:I

    return v0
.end method

.method public getButtonText(I)I
    .locals 2
    .param p1, "index"    # I

    .prologue
    .line 112
    sget-object v0, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->BUTTON_TEXTS:[I

    invoke-direct {p0, p1}, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->mapIndexToAction(I)I

    move-result v1

    aget v0, v0, v1

    return v0
.end method

.method public getDisplayContents()Ljava/lang/CharSequence;
    .locals 14

    .prologue
    const/4 v10, 0x0

    .line 172
    invoke-virtual {p0}, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->getResult()Lcom/google/zxing/client/result/ParsedResult;

    move-result-object v7

    check-cast v7, Lcom/google/zxing/client/result/AddressBookParsedResult;

    .line 173
    .local v7, "result":Lcom/google/zxing/client/result/AddressBookParsedResult;
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v9, 0x64

    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 174
    .local v1, "contents":Ljava/lang/StringBuilder;
    invoke-virtual {v7}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getNames()[Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v1}, Lcom/google/zxing/client/result/ParsedResult;->maybeAppend([Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 175
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    .line 177
    .local v3, "namesLength":I
    invoke-virtual {v7}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getPronunciation()Ljava/lang/String;

    move-result-object v6

    .line 178
    .local v6, "pronunciation":Ljava/lang/String;
    if-eqz v6, :cond_0

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_0

    .line 179
    const-string v9, "\n("

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    const/16 v9, 0x29

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 184
    :cond_0
    invoke-virtual {v7}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getTitle()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v1}, Lcom/google/zxing/client/result/ParsedResult;->maybeAppend(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 185
    invoke-virtual {v7}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getOrg()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v1}, Lcom/google/zxing/client/result/ParsedResult;->maybeAppend(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 186
    invoke-virtual {v7}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getAddresses()[Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v1}, Lcom/google/zxing/client/result/ParsedResult;->maybeAppend([Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 187
    invoke-virtual {v7}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getPhoneNumbers()[Ljava/lang/String;

    move-result-object v5

    .line 188
    .local v5, "numbers":[Ljava/lang/String;
    if-eqz v5, :cond_1

    .line 189
    array-length v11, v5

    move v9, v10

    :goto_0
    if-lt v9, v11, :cond_3

    .line 193
    :cond_1
    invoke-virtual {v7}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getEmails()[Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v1}, Lcom/google/zxing/client/result/ParsedResult;->maybeAppend([Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 194
    invoke-virtual {v7}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getURLs()[Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v1}, Lcom/google/zxing/client/result/ParsedResult;->maybeAppend([Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 196
    invoke-virtual {v7}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getBirthday()Ljava/lang/String;

    move-result-object v0

    .line 197
    .local v0, "birthday":Ljava/lang/String;
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_2

    .line 198
    invoke-static {v0}, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->parseDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    .line 199
    .local v2, "date":Ljava/util/Date;
    if-eqz v2, :cond_2

    .line 200
    const/4 v9, 0x2

    invoke-static {v9}, Ljava/text/DateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object v9

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v1}, Lcom/google/zxing/client/result/ParsedResult;->maybeAppend(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 203
    .end local v2    # "date":Ljava/util/Date;
    :cond_2
    invoke-virtual {v7}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getNote()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v1}, Lcom/google/zxing/client/result/ParsedResult;->maybeAppend(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 205
    if-lez v3, :cond_4

    .line 207
    new-instance v8, Landroid/text/SpannableString;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 208
    .local v8, "styled":Landroid/text/Spannable;
    new-instance v9, Landroid/text/style/StyleSpan;

    const/4 v11, 0x1

    invoke-direct {v9, v11}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-interface {v8, v9, v10, v3, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 211
    .end local v8    # "styled":Landroid/text/Spannable;
    :goto_1
    return-object v8

    .line 189
    .end local v0    # "birthday":Ljava/lang/String;
    :cond_3
    aget-object v4, v5, v9

    .line 190
    .local v4, "number":Ljava/lang/String;
    invoke-static {v4}, Landroid/telephony/PhoneNumberUtils;->formatNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v1}, Lcom/google/zxing/client/result/ParsedResult;->maybeAppend(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 189
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 211
    .end local v4    # "number":Ljava/lang/String;
    .restart local v0    # "birthday":Ljava/lang/String;
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_1
.end method

.method public getDisplayTitle()I
    .locals 1

    .prologue
    .line 217
    sget v0, Lcom/google/zxing/client/android/R$string;->result_address_book:I

    return v0
.end method

.method public handleButtonPress(I)V
    .locals 25
    .param p1, "index"    # I

    .prologue
    .line 117
    invoke-virtual/range {p0 .. p0}, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->getResult()Lcom/google/zxing/client/result/ParsedResult;

    move-result-object v20

    check-cast v20, Lcom/google/zxing/client/result/AddressBookParsedResult;

    .line 118
    .local v20, "addressResult":Lcom/google/zxing/client/result/AddressBookParsedResult;
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getAddresses()[Ljava/lang/String;

    move-result-object v22

    .line 119
    .local v22, "addresses":[Ljava/lang/String;
    if-eqz v22, :cond_0

    move-object/from16 v0, v22

    array-length v2, v0

    const/4 v3, 0x1

    if-ge v2, v3, :cond_2

    :cond_0
    const/4 v12, 0x0

    .line 120
    .local v12, "address1":Ljava/lang/String;
    :goto_0
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getAddressTypes()[Ljava/lang/String;

    move-result-object v21

    .line 121
    .local v21, "addressTypes":[Ljava/lang/String;
    if-eqz v21, :cond_1

    move-object/from16 v0, v21

    array-length v2, v0

    const/4 v3, 0x1

    if-ge v2, v3, :cond_3

    :cond_1
    const/4 v13, 0x0

    .line 122
    .local v13, "address1Type":Ljava/lang/String;
    :goto_1
    invoke-direct/range {p0 .. p1}, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->mapIndexToAction(I)I

    move-result v19

    .line 123
    .local v19, "action":I
    packed-switch v19, :pswitch_data_0

    .line 156
    :goto_2
    return-void

    .line 119
    .end local v12    # "address1":Ljava/lang/String;
    .end local v13    # "address1Type":Ljava/lang/String;
    .end local v19    # "action":I
    .end local v21    # "addressTypes":[Ljava/lang/String;
    :cond_2
    const/4 v2, 0x0

    aget-object v12, v22, v2

    goto :goto_0

    .line 121
    .restart local v12    # "address1":Ljava/lang/String;
    .restart local v21    # "addressTypes":[Ljava/lang/String;
    :cond_3
    const/4 v2, 0x0

    aget-object v13, v21, v2

    goto :goto_1

    .line 125
    .restart local v13    # "address1Type":Ljava/lang/String;
    .restart local v19    # "action":I
    :pswitch_0
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getNames()[Ljava/lang/String;

    move-result-object v3

    .line 126
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getNicknames()[Ljava/lang/String;

    move-result-object v4

    .line 127
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getPronunciation()Ljava/lang/String;

    move-result-object v5

    .line 128
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getPhoneNumbers()[Ljava/lang/String;

    move-result-object v6

    .line 129
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getPhoneTypes()[Ljava/lang/String;

    move-result-object v7

    .line 130
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getEmails()[Ljava/lang/String;

    move-result-object v8

    .line 131
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getEmailTypes()[Ljava/lang/String;

    move-result-object v9

    .line 132
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getNote()Ljava/lang/String;

    move-result-object v10

    .line 133
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getInstantMessenger()Ljava/lang/String;

    move-result-object v11

    .line 136
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getOrg()Ljava/lang/String;

    move-result-object v14

    .line 137
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getTitle()Ljava/lang/String;

    move-result-object v15

    .line 138
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getURLs()[Ljava/lang/String;

    move-result-object v16

    .line 139
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getBirthday()Ljava/lang/String;

    move-result-object v17

    .line 140
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getGeo()[Ljava/lang/String;

    move-result-object v18

    move-object/from16 v2, p0

    .line 125
    invoke-virtual/range {v2 .. v18}, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->addContact([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    goto :goto_2

    .line 143
    :pswitch_1
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getNames()[Ljava/lang/String;

    move-result-object v23

    .line 144
    .local v23, "names":[Ljava/lang/String;
    if-eqz v23, :cond_4

    const/4 v2, 0x0

    aget-object v24, v23, v2

    .line 145
    .local v24, "title":Ljava/lang/String;
    :goto_3
    move-object/from16 v0, p0

    move-object/from16 v1, v24

    invoke-virtual {v0, v12, v1}, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->searchMap(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 144
    .end local v24    # "title":Ljava/lang/String;
    :cond_4
    const/16 v24, 0x0

    goto :goto_3

    .line 148
    .end local v23    # "names":[Ljava/lang/String;
    :pswitch_2
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getPhoneNumbers()[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aget-object v2, v2, v3

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->dialPhone(Ljava/lang/String;)V

    goto :goto_2

    .line 151
    :pswitch_3
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getEmails()[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aget-object v2, v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3, v4}, Lcom/google/zxing/client/android/result/AddressBookResultHandler;->sendEmail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
