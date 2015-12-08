.class Lcom/scannerfire/model/ListenerObjects$7;
.super Ljava/lang/Object;
.source "ListenerObjects.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scannerfire/model/ListenerObjects;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scannerfire/model/ListenerObjects;


# direct methods
.method constructor <init>(Lcom/scannerfire/model/ListenerObjects;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/scannerfire/model/ListenerObjects$7;->this$0:Lcom/scannerfire/model/ListenerObjects;

    .line 269
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 14
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 273
    new-instance v4, Landroid/content/Intent;

    const-string v9, "android.intent.action.EDIT"

    invoke-direct {v4, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 274
    .local v4, "intent":Landroid/content/Intent;
    const-string v9, "vnd.android.cursor.item/event"

    invoke-virtual {v4, v9}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 275
    iget-object v9, p0, Lcom/scannerfire/model/ListenerObjects$7;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v5, v9, Lcom/scannerfire/model/ListenerObjects;->value:Ljava/lang/String;

    .line 276
    .local v5, "s":Ljava/lang/String;
    const-string v9, "\n|(:)"

    invoke-virtual {v5, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 277
    .local v8, "split":[Ljava/lang/String;
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    array-length v9, v8

    if-lt v3, v9, :cond_0

    .line 337
    iget-object v9, p0, Lcom/scannerfire/model/ListenerObjects$7;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v9, v9, Lcom/scannerfire/model/ListenerObjects;->context:Landroid/app/Activity;

    invoke-virtual {v9, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 338
    return-void

    .line 278
    :cond_0
    aget-object v9, v8, v3

    const-string v10, "DTSTART"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 280
    add-int/lit8 v9, v3, 0x1

    aget-object v6, v8, v9

    .line 281
    .local v6, "s1":Ljava/lang/String;
    const-string v9, "T"

    const-string v10, ""

    invoke-virtual {v6, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    .line 282
    const-string v9, "00Z"

    const-string v10, ""

    invoke-virtual {v6, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    .line 283
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    .line 284
    .local v0, "current":Ljava/util/Locale;
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v9, "yyyyMMddHHmm"

    invoke-direct {v7, v9, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 287
    .local v7, "sdf":Ljava/text/SimpleDateFormat;
    :try_start_0
    invoke-virtual {v7, v6}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    .line 288
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

    .line 289
    const-string v9, "beginTime"

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    invoke-virtual {v4, v9, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 297
    .end local v0    # "current":Ljava/util/Locale;
    .end local v1    # "date":Ljava/util/Date;
    .end local v6    # "s1":Ljava/lang/String;
    .end local v7    # "sdf":Ljava/text/SimpleDateFormat;
    :cond_1
    :goto_1
    aget-object v9, v8, v3

    const-string v10, "DTEND"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 299
    add-int/lit8 v9, v3, 0x1

    aget-object v6, v8, v9

    .line 300
    .restart local v6    # "s1":Ljava/lang/String;
    const-string v9, "T"

    const-string v10, ""

    invoke-virtual {v6, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    .line 301
    const-string v9, "00Z"

    const-string v10, ""

    invoke-virtual {v6, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    .line 302
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v9, "yyyyMMddHHmm"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v10

    invoke-direct {v7, v9, v10}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 305
    .restart local v7    # "sdf":Ljava/text/SimpleDateFormat;
    :try_start_1
    invoke-virtual {v7, v6}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    .line 306
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

    .line 307
    const-string v9, "endTime"

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    invoke-virtual {v4, v9, v10, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1

    .line 314
    .end local v1    # "date":Ljava/util/Date;
    .end local v6    # "s1":Ljava/lang/String;
    .end local v7    # "sdf":Ljava/text/SimpleDateFormat;
    :cond_2
    :goto_2
    aget-object v9, v8, v3

    const-string v10, "LOCATION"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 316
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

    .line 317
    const-string v9, "eventLocation"

    add-int/lit8 v10, v3, 0x1

    aget-object v10, v8, v10

    invoke-virtual {v4, v9, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 321
    :cond_3
    aget-object v9, v8, v3

    const-string v10, "DESCRIPTION"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 323
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

    .line 324
    const-string v9, "description"

    add-int/lit8 v10, v3, 0x1

    aget-object v10, v8, v10

    invoke-virtual {v4, v9, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 328
    :cond_4
    aget-object v9, v8, v3

    const-string v10, "SUMMARY"

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 330
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

    .line 331
    const-string v9, "title"

    add-int/lit8 v10, v3, 0x1

    aget-object v10, v8, v10

    invoke-virtual {v4, v9, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 277
    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 290
    .restart local v0    # "current":Ljava/util/Locale;
    .restart local v6    # "s1":Ljava/lang/String;
    .restart local v7    # "sdf":Ljava/text/SimpleDateFormat;
    :catch_0
    move-exception v2

    .line 292
    .local v2, "e":Ljava/text/ParseException;
    invoke-virtual {v2}, Ljava/text/ParseException;->printStackTrace()V

    goto/16 :goto_1

    .line 308
    .end local v0    # "current":Ljava/util/Locale;
    .end local v2    # "e":Ljava/text/ParseException;
    :catch_1
    move-exception v2

    .line 310
    .restart local v2    # "e":Ljava/text/ParseException;
    invoke-virtual {v2}, Ljava/text/ParseException;->printStackTrace()V

    goto/16 :goto_2
.end method
