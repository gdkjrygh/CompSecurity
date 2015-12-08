.class Lcom/QRBS/activity/MyResultActivity$11;
.super Ljava/lang/Object;
.source "MyResultActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/MyResultActivity;->buildButton(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/MyResultActivity;

.field private final synthetic val$text:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/MyResultActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/MyResultActivity$11;->this$0:Lcom/QRBS/activity/MyResultActivity;

    iput-object p2, p0, Lcom/QRBS/activity/MyResultActivity$11;->val$text:Ljava/lang/String;

    .line 259
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 14
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 276
    new-instance v4, Landroid/content/Intent;

    const-string v9, "android.intent.action.EDIT"

    invoke-direct {v4, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 277
    .local v4, "intent":Landroid/content/Intent;
    const-string v9, "vnd.android.cursor.item/event"

    invoke-virtual {v4, v9}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 278
    iget-object v5, p0, Lcom/QRBS/activity/MyResultActivity$11;->val$text:Ljava/lang/String;

    .line 279
    .local v5, "s":Ljava/lang/String;
    const-string v9, "\n|(:)"

    invoke-virtual {v5, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 280
    .local v8, "split":[Ljava/lang/String;
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    array-length v9, v8

    if-lt v3, v9, :cond_0

    .line 341
    iget-object v9, p0, Lcom/QRBS/activity/MyResultActivity$11;->this$0:Lcom/QRBS/activity/MyResultActivity;

    invoke-virtual {v9, v4}, Lcom/QRBS/activity/MyResultActivity;->startActivity(Landroid/content/Intent;)V

    .line 366
    return-void

    .line 281
    :cond_0
    aget-object v9, v8, v3

    const-string v10, "DTSTART"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 283
    add-int/lit8 v9, v3, 0x1

    aget-object v6, v8, v9

    .line 284
    .local v6, "s1":Ljava/lang/String;
    if-nez v6, :cond_2

    .line 280
    .end local v6    # "s1":Ljava/lang/String;
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 285
    .restart local v6    # "s1":Ljava/lang/String;
    :cond_2
    const-string v9, "T"

    const-string v10, ""

    invoke-virtual {v6, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    .line 286
    const-string v9, "00Z"

    const-string v10, ""

    invoke-virtual {v6, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    .line 287
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 288
    .local v0, "current":Ljava/util/Locale;
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v9, "yyyyMMddHHmm"

    invoke-direct {v7, v9, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 291
    .local v7, "sdf":Ljava/text/SimpleDateFormat;
    :try_start_0
    invoke-virtual {v7, v6}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    .line 292
    .local v1, "date":Ljava/util/Date;
    const-string v9, ""

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "START "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    invoke-virtual {v10, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 293
    const-string v9, "beginTime"

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    invoke-virtual {v4, v9, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 301
    .end local v0    # "current":Ljava/util/Locale;
    .end local v1    # "date":Ljava/util/Date;
    .end local v6    # "s1":Ljava/lang/String;
    .end local v7    # "sdf":Ljava/text/SimpleDateFormat;
    :cond_3
    :goto_2
    aget-object v9, v8, v3

    const-string v10, "DTEND"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 303
    add-int/lit8 v9, v3, 0x1

    aget-object v6, v8, v9

    .line 304
    .restart local v6    # "s1":Ljava/lang/String;
    if-eqz v6, :cond_1

    .line 305
    const-string v9, "T"

    const-string v10, ""

    invoke-virtual {v6, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    .line 306
    const-string v9, "00Z"

    const-string v10, ""

    invoke-virtual {v6, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    .line 307
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v9, "yyyyMMddHHmm"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v10

    invoke-direct {v7, v9, v10}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 310
    .restart local v7    # "sdf":Ljava/text/SimpleDateFormat;
    :try_start_1
    invoke-virtual {v7, v6}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    .line 311
    .restart local v1    # "date":Ljava/util/Date;
    const-string v9, ""

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "END "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    invoke-virtual {v10, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 312
    const-string v9, "endTime"

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    invoke-virtual {v4, v9, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1

    .line 319
    .end local v1    # "date":Ljava/util/Date;
    .end local v6    # "s1":Ljava/lang/String;
    .end local v7    # "sdf":Ljava/text/SimpleDateFormat;
    :cond_4
    :goto_3
    aget-object v9, v8, v3

    const-string v10, "LOCATION"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 321
    const-string v9, ""

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Luogo "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v11, v3, 0x1

    aget-object v11, v8, v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 322
    add-int/lit8 v9, v3, 0x1

    aget-object v9, v8, v9

    if-eqz v9, :cond_5

    const-string v9, "eventLocation"

    add-int/lit8 v10, v3, 0x1

    aget-object v10, v8, v10

    invoke-virtual {v4, v9, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 326
    :cond_5
    aget-object v9, v8, v3

    const-string v10, "DESCRIPTION"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 328
    const-string v9, ""

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Descrizione "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v11, v3, 0x1

    aget-object v11, v8, v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 329
    add-int/lit8 v9, v3, 0x1

    aget-object v9, v8, v9

    if-eqz v9, :cond_6

    const-string v9, "description"

    add-int/lit8 v10, v3, 0x1

    aget-object v10, v8, v10

    invoke-virtual {v4, v9, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 333
    :cond_6
    aget-object v9, v8, v3

    const-string v10, "SUMMARY"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 335
    const-string v9, ""

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Titolo "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v11, v3, 0x1

    aget-object v11, v8, v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 336
    add-int/lit8 v9, v3, 0x1

    aget-object v9, v8, v9

    if-eqz v9, :cond_1

    const-string v9, "title"

    add-int/lit8 v10, v3, 0x1

    aget-object v10, v8, v10

    invoke-virtual {v4, v9, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto/16 :goto_1

    .line 294
    .restart local v0    # "current":Ljava/util/Locale;
    .restart local v6    # "s1":Ljava/lang/String;
    .restart local v7    # "sdf":Ljava/text/SimpleDateFormat;
    :catch_0
    move-exception v2

    .line 296
    .local v2, "e":Ljava/text/ParseException;
    invoke-virtual {v2}, Ljava/text/ParseException;->printStackTrace()V

    goto/16 :goto_2

    .line 313
    .end local v0    # "current":Ljava/util/Locale;
    .end local v2    # "e":Ljava/text/ParseException;
    :catch_1
    move-exception v2

    .line 315
    .restart local v2    # "e":Ljava/text/ParseException;
    invoke-virtual {v2}, Ljava/text/ParseException;->printStackTrace()V

    goto/16 :goto_3
.end method
