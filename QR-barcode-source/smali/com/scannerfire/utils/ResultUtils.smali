.class public Lcom/scannerfire/utils/ResultUtils;
.super Ljava/lang/Object;
.source "ResultUtils.java"


# static fields
.field private static synthetic $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE:[I


# instance fields
.field context:Landroid/app/Activity;


# direct methods
.method static synthetic $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()[I
    .locals 3

    .prologue
    .line 22
    sget-object v0, Lcom/scannerfire/utils/ResultUtils;->$SWITCH_TABLE$com$scannerfire$utils$Utils$MODE:[I

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
    sput-object v0, Lcom/scannerfire/utils/ResultUtils;->$SWITCH_TABLE$com$scannerfire$utils$Utils$MODE:[I

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

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0
    .param p1, "c"    # Landroid/app/Activity;

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    .line 27
    return-void
.end method

.method public static myAddressbookIntent(Landroid/os/Bundle;Landroid/app/Activity;)V
    .locals 14
    .param p0, "bundle"    # Landroid/os/Bundle;
    .param p1, "context"    # Landroid/app/Activity;

    .prologue
    const/4 v13, 0x0

    .line 212
    new-instance v5, Landroid/content/Intent;

    const-string v10, "android.intent.action.INSERT"

    invoke-direct {v5, v10}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 214
    .local v5, "intent":Landroid/content/Intent;
    const-string v10, "vnd.android.cursor.dir/raw_contact"

    invoke-virtual {v5, v10}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 216
    if-eqz p0, :cond_7

    .line 217
    const-string v10, "extraData"

    invoke-virtual {p0, v10}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    .line 218
    .local v2, "extraData":Landroid/os/Bundle;
    if-eqz v2, :cond_7

    .line 219
    const-string v10, "names"

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 220
    .local v6, "names":[Ljava/lang/String;
    if-eqz v6, :cond_0

    aget-object v10, v6, v13

    if-eqz v10, :cond_0

    const-string v10, "name"

    aget-object v11, v6, v13

    invoke-virtual {v5, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 221
    :cond_0
    const-string v10, "phones"

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 222
    .local v8, "phones":[Ljava/lang/String;
    if-eqz v8, :cond_1

    .line 223
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    array-length v10, v8

    if-ge v3, v10, :cond_1

    sget-object v10, Lcom/google/zxing/client/android/Contents;->PHONE_KEYS:[Ljava/lang/String;

    array-length v10, v10

    if-lt v3, v10, :cond_8

    .line 227
    .end local v3    # "i":I
    :cond_1
    const-string v10, "emails"

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 228
    .local v1, "emails":[Ljava/lang/String;
    if-eqz v1, :cond_2

    .line 229
    const/4 v3, 0x0

    .restart local v3    # "i":I
    :goto_1
    array-length v10, v1

    if-ge v3, v10, :cond_2

    sget-object v10, Lcom/google/zxing/client/android/Contents;->EMAIL_KEYS:[Ljava/lang/String;

    array-length v10, v10

    if-lt v3, v10, :cond_9

    .line 232
    .end local v3    # "i":I
    :cond_2
    const-string v10, "org"

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_3

    .line 233
    const-string v10, "company"

    const-string v11, "org"

    invoke-virtual {v2, v11}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 234
    :cond_3
    const-string v10, "title"

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_4

    .line 235
    const-string v10, "job_title"

    const-string v11, "title"

    invoke-virtual {v2, v11}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 236
    :cond_4
    const-string v10, "indirizzi"

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 237
    .local v4, "indirizzi":[Ljava/lang/String;
    if-eqz v4, :cond_5

    .line 238
    const-string v10, "postal"

    aget-object v11, v4, v13

    invoke-virtual {v5, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 240
    :cond_5
    const-string v10, "note"

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 241
    .local v7, "note":Ljava/lang/String;
    const-string v10, ""

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "Note: "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 242
    if-eqz v7, :cond_6

    .line 243
    const-string v10, "notes"

    invoke-virtual {v5, v10, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 247
    :cond_6
    const-string v10, "siti"

    invoke-virtual {v2, v10}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    .line 248
    .local v9, "websites":[Ljava/lang/String;
    if-eqz v9, :cond_7

    aget-object v10, v9, v13

    if-eqz v10, :cond_7

    .line 250
    const-string v10, ""

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "WEBSITE: "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v12, v9, v13

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 267
    .end local v1    # "emails":[Ljava/lang/String;
    .end local v2    # "extraData":Landroid/os/Bundle;
    .end local v4    # "indirizzi":[Ljava/lang/String;
    .end local v6    # "names":[Ljava/lang/String;
    .end local v7    # "note":Ljava/lang/String;
    .end local v8    # "phones":[Ljava/lang/String;
    .end local v9    # "websites":[Ljava/lang/String;
    :cond_7
    :try_start_0
    invoke-virtual {p1, v5}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 272
    :goto_2
    return-void

    .line 224
    .restart local v2    # "extraData":Landroid/os/Bundle;
    .restart local v3    # "i":I
    .restart local v6    # "names":[Ljava/lang/String;
    .restart local v8    # "phones":[Ljava/lang/String;
    :cond_8
    const-string v10, ""

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "Phone "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, ":"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    aget-object v12, v8, v3

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 225
    sget-object v10, Lcom/google/zxing/client/android/Contents;->PHONE_KEYS:[Ljava/lang/String;

    aget-object v10, v10, v3

    aget-object v11, v8, v3

    invoke-virtual {v5, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 223
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 230
    .restart local v1    # "emails":[Ljava/lang/String;
    :cond_9
    sget-object v10, Lcom/google/zxing/client/android/Contents;->EMAIL_KEYS:[Ljava/lang/String;

    aget-object v10, v10, v3

    aget-object v11, v1, v3

    invoke-virtual {v5, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 229
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_1

    .line 269
    .end local v1    # "emails":[Ljava/lang/String;
    .end local v2    # "extraData":Landroid/os/Bundle;
    .end local v3    # "i":I
    .end local v6    # "names":[Ljava/lang/String;
    .end local v8    # "phones":[Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 270
    .local v0, "e":Landroid/content/ActivityNotFoundException;
    const v10, 0x7f080157

    invoke-virtual {p1, v10}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {p1, v10}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_2
.end method


# virtual methods
.method public getCustomString(Lcom/scannerfire/utils/Utils$MODE;)Ljava/lang/String;
    .locals 3
    .param p1, "mode"    # Lcom/scannerfire/utils/Utils$MODE;

    .prologue
    const/4 v0, 0x0

    .line 277
    invoke-static {}, Lcom/scannerfire/utils/ResultUtils;->$SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()[I

    move-result-object v1

    invoke-virtual {p1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 297
    :goto_0
    :pswitch_0
    return-object v0

    .line 281
    :pswitch_1
    iget-object v0, p0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    const v1, 0x7f080149

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 283
    :pswitch_2
    iget-object v0, p0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    const v1, 0x7f08011a

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 285
    :pswitch_3
    iget-object v0, p0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    const v1, 0x7f0800c0

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 287
    :pswitch_4
    iget-object v0, p0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    const v1, 0x7f080114

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 289
    :pswitch_5
    iget-object v0, p0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    const v1, 0x7f080117

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 291
    :pswitch_6
    iget-object v0, p0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    const v1, 0x7f0800bf

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 293
    :pswitch_7
    iget-object v0, p0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    const v1, 0x7f08014b

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 295
    :pswitch_8
    iget-object v0, p0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    const v1, 0x7f0800be

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 277
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_8
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_5
        :pswitch_7
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public getIconFromMode(Lcom/scannerfire/utils/Utils$MODE;)Landroid/graphics/drawable/Drawable;
    .locals 4
    .param p1, "mode"    # Lcom/scannerfire/utils/Utils$MODE;

    .prologue
    const/4 v0, 0x0

    const v3, 0x7f02010a

    .line 302
    invoke-static {}, Lcom/scannerfire/utils/ResultUtils;->$SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()[I

    move-result-object v1

    invoke-virtual {p1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 320
    :goto_0
    :pswitch_0
    return-object v0

    .line 306
    :pswitch_1
    iget-object v0, p0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    .line 308
    :pswitch_2
    iget-object v0, p0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200da

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    .line 310
    :pswitch_3
    iget-object v0, p0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    .line 312
    :pswitch_4
    iget-object v0, p0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200d7

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    .line 314
    :pswitch_5
    iget-object v0, p0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200d9

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    .line 316
    :pswitch_6
    iget-object v0, p0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200db

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    .line 318
    :pswitch_7
    iget-object v0, p0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200dc

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    .line 302
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_7
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_4
        :pswitch_6
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public makeAction(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/zxing/Result;)V
    .locals 23
    .param p1, "TYPE"    # Ljava/lang/String;
    .param p2, "FORMAT"    # Ljava/lang/String;
    .param p3, "text"    # Ljava/lang/String;
    .param p4, "result"    # Lcom/google/zxing/Result;

    .prologue
    .line 32
    const-string v18, "CODE_39"

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-nez v18, :cond_0

    const-string v18, "CODE_128"

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_2

    .line 34
    :cond_0
    new-instance v18, Ljava/lang/StringBuilder;

    const-string v19, "http://www.google.com/m/products?q="

    invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v18

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 35
    .local v13, "s":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    move-object/from16 v18, v0

    new-instance v19, Landroid/content/Intent;

    const-string v20, "android.intent.action.VIEW"

    invoke-static {v13}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v21

    invoke-direct/range {v19 .. v21}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual/range {v18 .. v19}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 205
    .end local v13    # "s":Ljava/lang/String;
    :cond_1
    :goto_0
    return-void

    .line 40
    :cond_2
    const-string v18, "URI"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_4

    .line 41
    if-eqz p3, :cond_1

    .line 42
    const-string v18, ""

    new-instance v19, Ljava/lang/StringBuilder;

    const-string v20, "URI -> "

    invoke-direct/range {v19 .. v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v19

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    const-string v20, "\n"

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    const-string v18, ""

    new-instance v19, Ljava/lang/StringBuilder;

    const-string v20, "SCHEME -> "

    invoke-direct/range {v19 .. v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static/range {p3 .. p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    const-string v18, ""

    new-instance v19, Ljava/lang/StringBuilder;

    const-string v20, "NEW URI -> "

    invoke-direct/range {v19 .. v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v20, "http://"

    move-object/from16 v0, p3

    move-object/from16 v1, v20

    invoke-static {v0, v1}, Lcom/scannerfire/utils/Utils;->URICorrection(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    const-string v18, "http://"

    move-object/from16 v0, p3

    move-object/from16 v1, v18

    invoke-static {v0, v1}, Lcom/scannerfire/utils/Utils;->URICorrection(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 48
    .local v6, "correctURI":Ljava/lang/String;
    const-string v18, "market://details?id="

    move-object/from16 v0, v18

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v18

    if-eqz v18, :cond_3

    .line 50
    const-string v18, "="

    move-object/from16 v0, v18

    invoke-virtual {v6, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v16

    .line 52
    .local v16, "split":[Ljava/lang/String;
    :try_start_0
    const-string v18, ""

    new-instance v19, Ljava/lang/StringBuilder;

    const-string v20, "SPLIT 1->"

    invoke-direct/range {v19 .. v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v20, 0x0

    aget-object v20, v16, v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    const-string v20, " SPLIT 2->"

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    const/16 v20, 0x1

    aget-object v20, v16, v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    move-object/from16 v18, v0

    new-instance v19, Landroid/content/Intent;

    const-string v20, "android.intent.action.VIEW"

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v21

    invoke-direct/range {v19 .. v21}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual/range {v18 .. v19}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 54
    :catch_0
    move-exception v4

    .line 55
    .local v4, "anfe":Landroid/content/ActivityNotFoundException;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    move-object/from16 v18, v0

    new-instance v19, Landroid/content/Intent;

    const-string v20, "android.intent.action.VIEW"

    new-instance v21, Ljava/lang/StringBuilder;

    const-string v22, "http://play.google.com/store/apps/details?id="

    invoke-direct/range {v21 .. v22}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v22, 0x1

    aget-object v22, v16, v22

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v21

    invoke-direct/range {v19 .. v21}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual/range {v18 .. v19}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 62
    .end local v4    # "anfe":Landroid/content/ActivityNotFoundException;
    .end local v16    # "split":[Ljava/lang/String;
    :cond_3
    move-object v13, v6

    .line 64
    .restart local v13    # "s":Ljava/lang/String;
    :try_start_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    move-object/from16 v18, v0

    new-instance v19, Landroid/content/Intent;

    const-string v20, "android.intent.action.VIEW"

    invoke-static {v13}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v21

    invoke-direct/range {v19 .. v21}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual/range {v18 .. v19}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_0

    .line 66
    :catch_1
    move-exception v4

    .line 67
    .restart local v4    # "anfe":Landroid/content/ActivityNotFoundException;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    move-object/from16 v18, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    move-object/from16 v19, v0

    const v20, 0x7f080157

    invoke-virtual/range {v19 .. v20}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    .line 68
    const-string v18, ""

    new-instance v19, Ljava/lang/StringBuilder;

    const-string v20, "ActivityNotFoundException: url is ->"

    invoke-direct/range {v19 .. v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v19

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 77
    .end local v4    # "anfe":Landroid/content/ActivityNotFoundException;
    .end local v6    # "correctURI":Ljava/lang/String;
    .end local v13    # "s":Ljava/lang/String;
    :cond_4
    const-string v18, "ADDRESSBOOK"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_5

    .line 78
    invoke-static/range {p4 .. p4}, Lcom/scannerfire/utils/Utils;->makeBundle(Lcom/google/zxing/Result;)Landroid/os/Bundle;

    move-result-object v5

    .line 79
    .local v5, "bundle":Landroid/os/Bundle;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    invoke-static {v5, v0}, Lcom/scannerfire/utils/ResultUtils;->myAddressbookIntent(Landroid/os/Bundle;Landroid/app/Activity;)V

    goto/16 :goto_0

    .line 84
    .end local v5    # "bundle":Landroid/os/Bundle;
    :cond_5
    const-string v18, "GEO"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_7

    .line 86
    const-string v18, "geo:"

    move-object/from16 v0, p3

    move-object/from16 v1, v18

    invoke-static {v0, v1}, Lcom/scannerfire/utils/Utils;->URICorrection(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 88
    .local v17, "t":Ljava/lang/String;
    :try_start_2
    const-string v18, ""

    new-instance v19, Ljava/lang/StringBuilder;

    const-string v20, "TEXT ->"

    invoke-direct/range {v19 .. v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v19

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    new-instance v12, Landroid/content/Intent;

    const-string v18, "android.intent.action.VIEW"

    move-object/from16 v0, v18

    invoke-direct {v12, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 90
    .local v12, "intent":Landroid/content/Intent;
    const-string v18, "?"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_6

    new-instance v18, Ljava/lang/StringBuilder;

    invoke-static/range {v17 .. v17}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v19

    invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v19, "&z=16"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v12, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 92
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    invoke-virtual {v0, v12}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_0

    .line 93
    .end local v12    # "intent":Landroid/content/Intent;
    :catch_2
    move-exception v4

    .line 94
    .restart local v4    # "anfe":Landroid/content/ActivityNotFoundException;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    move-object/from16 v18, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    move-object/from16 v19, v0

    const v20, 0x7f080116

    invoke-virtual/range {v19 .. v20}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 91
    .end local v4    # "anfe":Landroid/content/ActivityNotFoundException;
    .restart local v12    # "intent":Landroid/content/Intent;
    :cond_6
    :try_start_3
    new-instance v18, Ljava/lang/StringBuilder;

    invoke-static/range {v17 .. v17}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v19

    invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v19, "?z=16"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v12, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
    :try_end_3
    .catch Landroid/content/ActivityNotFoundException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    .line 101
    .end local v12    # "intent":Landroid/content/Intent;
    .end local v17    # "t":Ljava/lang/String;
    :cond_7
    const-string v18, "TEL"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_8

    .line 103
    new-instance v12, Landroid/content/Intent;

    const-string v18, "android.intent.action.DIAL"

    invoke-static/range {p3 .. p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v19

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-direct {v12, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 104
    .restart local v12    # "intent":Landroid/content/Intent;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    invoke-virtual {v0, v12}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 108
    .end local v12    # "intent":Landroid/content/Intent;
    :cond_8
    const-string v18, "EMAIL_ADDRESS"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_9

    .line 109
    new-instance v10, Landroid/content/Intent;

    const-string v18, "android.intent.action.SENDTO"

    invoke-static/range {p3 .. p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v19

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-direct {v10, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 110
    .local v10, "emailIntent":Landroid/content/Intent;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    move-object/from16 v18, v0

    const-string v19, "Send with:"

    move-object/from16 v0, v19

    invoke-static {v10, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 114
    .end local v10    # "emailIntent":Landroid/content/Intent;
    :cond_9
    const-string v18, "TEXT"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-nez v18, :cond_1

    .line 118
    const-string v18, "CALENDAR"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_11

    .line 119
    new-instance v12, Landroid/content/Intent;

    const-string v18, "android.intent.action.EDIT"

    move-object/from16 v0, v18

    invoke-direct {v12, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 120
    .restart local v12    # "intent":Landroid/content/Intent;
    const-string v18, "vnd.android.cursor.item/event"

    move-object/from16 v0, v18

    invoke-virtual {v12, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 121
    move-object/from16 v13, p3

    .line 122
    .restart local v13    # "s":Ljava/lang/String;
    const-string v18, "\n|(:)"

    move-object/from16 v0, v18

    invoke-virtual {v13, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v16

    .line 123
    .restart local v16    # "split":[Ljava/lang/String;
    const/4 v11, 0x0

    .local v11, "i":I
    :goto_2
    move-object/from16 v0, v16

    array-length v0, v0

    move/from16 v18, v0

    move/from16 v0, v18

    if-lt v11, v0, :cond_a

    .line 184
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    invoke-virtual {v0, v12}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 124
    :cond_a
    aget-object v18, v16, v11

    const-string v19, "DTSTART"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_d

    .line 126
    add-int/lit8 v18, v11, 0x1

    aget-object v14, v16, v18

    .line 127
    .local v14, "s1":Ljava/lang/String;
    if-nez v14, :cond_c

    .line 123
    .end local v14    # "s1":Ljava/lang/String;
    :cond_b
    :goto_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 128
    .restart local v14    # "s1":Ljava/lang/String;
    :cond_c
    const-string v18, "T"

    const-string v19, ""

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v14, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v14

    .line 129
    const-string v18, "00Z"

    const-string v19, ""

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v14, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v14

    .line 130
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    .line 131
    .local v7, "current":Ljava/util/Locale;
    new-instance v15, Ljava/text/SimpleDateFormat;

    const-string v18, "yyyyMMddHHmm"

    move-object/from16 v0, v18

    invoke-direct {v15, v0, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 134
    .local v15, "sdf":Ljava/text/SimpleDateFormat;
    :try_start_4
    invoke-virtual {v15, v14}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v8

    .line 135
    .local v8, "date":Ljava/util/Date;
    const-string v18, ""

    new-instance v19, Ljava/lang/StringBuilder;

    const-string v20, "START "

    invoke-direct/range {v19 .. v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v20

    invoke-virtual/range {v19 .. v21}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    const-string v18, "beginTime"

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v20

    move-object/from16 v0, v18

    move-wide/from16 v1, v20

    invoke-virtual {v12, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;
    :try_end_4
    .catch Ljava/text/ParseException; {:try_start_4 .. :try_end_4} :catch_3

    .line 144
    .end local v7    # "current":Ljava/util/Locale;
    .end local v8    # "date":Ljava/util/Date;
    .end local v14    # "s1":Ljava/lang/String;
    .end local v15    # "sdf":Ljava/text/SimpleDateFormat;
    :cond_d
    :goto_4
    aget-object v18, v16, v11

    const-string v19, "DTEND"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_e

    .line 146
    add-int/lit8 v18, v11, 0x1

    aget-object v14, v16, v18

    .line 147
    .restart local v14    # "s1":Ljava/lang/String;
    if-eqz v14, :cond_b

    .line 148
    const-string v18, "T"

    const-string v19, ""

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v14, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v14

    .line 149
    const-string v18, "00Z"

    const-string v19, ""

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v14, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v14

    .line 150
    new-instance v15, Ljava/text/SimpleDateFormat;

    const-string v18, "yyyyMMddHHmm"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v19

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-direct {v15, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 153
    .restart local v15    # "sdf":Ljava/text/SimpleDateFormat;
    :try_start_5
    invoke-virtual {v15, v14}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v8

    .line 154
    .restart local v8    # "date":Ljava/util/Date;
    const-string v18, ""

    new-instance v19, Ljava/lang/StringBuilder;

    const-string v20, "END "

    invoke-direct/range {v19 .. v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v20

    invoke-virtual/range {v19 .. v21}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 155
    const-string v18, "endTime"

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v20

    move-object/from16 v0, v18

    move-wide/from16 v1, v20

    invoke-virtual {v12, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;
    :try_end_5
    .catch Ljava/text/ParseException; {:try_start_5 .. :try_end_5} :catch_4

    .line 162
    .end local v8    # "date":Ljava/util/Date;
    .end local v14    # "s1":Ljava/lang/String;
    .end local v15    # "sdf":Ljava/text/SimpleDateFormat;
    :cond_e
    :goto_5
    aget-object v18, v16, v11

    const-string v19, "LOCATION"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_f

    .line 164
    const-string v18, ""

    new-instance v19, Ljava/lang/StringBuilder;

    const-string v20, "Luogo "

    invoke-direct/range {v19 .. v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v20, v11, 0x1

    aget-object v20, v16, v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    add-int/lit8 v18, v11, 0x1

    aget-object v18, v16, v18

    if-eqz v18, :cond_f

    const-string v18, "eventLocation"

    add-int/lit8 v19, v11, 0x1

    aget-object v19, v16, v19

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v12, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 169
    :cond_f
    aget-object v18, v16, v11

    const-string v19, "DESCRIPTION"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_10

    .line 171
    const-string v18, ""

    new-instance v19, Ljava/lang/StringBuilder;

    const-string v20, "Descrizione "

    invoke-direct/range {v19 .. v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v20, v11, 0x1

    aget-object v20, v16, v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 172
    add-int/lit8 v18, v11, 0x1

    aget-object v18, v16, v18

    if-eqz v18, :cond_10

    const-string v18, "description"

    add-int/lit8 v19, v11, 0x1

    aget-object v19, v16, v19

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v12, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 176
    :cond_10
    aget-object v18, v16, v11

    const-string v19, "SUMMARY"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_b

    .line 178
    const-string v18, ""

    new-instance v19, Ljava/lang/StringBuilder;

    const-string v20, "Titolo "

    invoke-direct/range {v19 .. v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v20, v11, 0x1

    aget-object v20, v16, v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 179
    add-int/lit8 v18, v11, 0x1

    aget-object v18, v16, v18

    if-eqz v18, :cond_b

    const-string v18, "title"

    add-int/lit8 v19, v11, 0x1

    aget-object v19, v16, v19

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v12, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto/16 :goto_3

    .line 137
    .restart local v7    # "current":Ljava/util/Locale;
    .restart local v14    # "s1":Ljava/lang/String;
    .restart local v15    # "sdf":Ljava/text/SimpleDateFormat;
    :catch_3
    move-exception v9

    .line 139
    .local v9, "e":Ljava/text/ParseException;
    invoke-virtual {v9}, Ljava/text/ParseException;->printStackTrace()V

    goto/16 :goto_4

    .line 156
    .end local v7    # "current":Ljava/util/Locale;
    .end local v9    # "e":Ljava/text/ParseException;
    :catch_4
    move-exception v9

    .line 158
    .restart local v9    # "e":Ljava/text/ParseException;
    invoke-virtual {v9}, Ljava/text/ParseException;->printStackTrace()V

    goto/16 :goto_5

    .line 189
    .end local v9    # "e":Ljava/text/ParseException;
    .end local v11    # "i":I
    .end local v12    # "intent":Landroid/content/Intent;
    .end local v13    # "s":Ljava/lang/String;
    .end local v14    # "s1":Ljava/lang/String;
    .end local v15    # "sdf":Ljava/text/SimpleDateFormat;
    .end local v16    # "split":[Ljava/lang/String;
    :cond_11
    const-string v18, "PRODUCT"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_12

    .line 191
    new-instance v18, Ljava/lang/StringBuilder;

    const-string v19, "http://www.google.com/m/products?q="

    invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v18

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 192
    .restart local v13    # "s":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    move-object/from16 v18, v0

    new-instance v19, Landroid/content/Intent;

    const-string v20, "android.intent.action.VIEW"

    invoke-static {v13}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v21

    invoke-direct/range {v19 .. v21}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual/range {v18 .. v19}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 196
    .end local v13    # "s":Ljava/lang/String;
    :cond_12
    const-string v18, "ISBN"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1

    .line 198
    new-instance v18, Ljava/lang/StringBuilder;

    const-string v19, "http://books.google.com/books?vid=isbn"

    invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v18

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 199
    .restart local v13    # "s":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/scannerfire/utils/ResultUtils;->context:Landroid/app/Activity;

    move-object/from16 v18, v0

    new-instance v19, Landroid/content/Intent;

    const-string v20, "android.intent.action.VIEW"

    invoke-static {v13}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v21

    invoke-direct/range {v19 .. v21}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual/range {v18 .. v19}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0
.end method
