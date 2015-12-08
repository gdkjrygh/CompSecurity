.class public Lcom/scannerfire/utils/EncodeUtils;
.super Ljava/lang/Object;
.source "EncodeUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scannerfire/utils/EncodeUtils$CalSel;,
        Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;,
        Lcom/scannerfire/utils/EncodeUtils$EncodeTask;,
        Lcom/scannerfire/utils/EncodeUtils$ICal;,
        Lcom/scannerfire/utils/EncodeUtils$ShareTask;
    }
.end annotation


# instance fields
.field final activity:Landroid/app/Activity;

.field prog:Landroid/app/ProgressDialog;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0
    .param p1, "a"    # Landroid/app/Activity;

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    .line 46
    return-void
.end method

.method public static ICalToString(Lcom/scannerfire/utils/EncodeUtils$ICal;)Ljava/lang/String;
    .locals 10
    .param p0, "a"    # Lcom/scannerfire/utils/EncodeUtils$ICal;

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 354
    const/4 v7, 0x0

    .line 355
    .local v7, "s":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/scannerfire/utils/EncodeUtils$ICal;->getStart()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 356
    .local v8, "split":[Ljava/lang/String;
    invoke-virtual {p0}, Lcom/scannerfire/utils/EncodeUtils$ICal;->getEnd()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\s+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    .line 357
    .local v9, "split2":[Ljava/lang/String;
    invoke-virtual {p0}, Lcom/scannerfire/utils/EncodeUtils$ICal;->getWhat()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/scannerfire/utils/EncodeUtils$ICal;->getWhere()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/scannerfire/utils/EncodeUtils$ICal;->getDes()Ljava/lang/String;

    move-result-object v2

    aget-object v3, v8, v5

    aget-object v4, v8, v6

    aget-object v5, v9, v5

    aget-object v6, v9, v6

    invoke-static/range {v0 .. v6}, Lcom/scannerfire/utils/EncodeUtils;->createCalendarString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    .line 358
    return-object v7
.end method

.method public static createCalendarString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 4
    .param p0, "what"    # Ljava/lang/String;
    .param p1, "where"    # Ljava/lang/String;
    .param p2, "des"    # Ljava/lang/String;
    .param p3, "d"    # Ljava/lang/CharSequence;
    .param p4, "t"    # Ljava/lang/CharSequence;
    .param p5, "d2"    # Ljava/lang/CharSequence;
    .param p6, "t2"    # Ljava/lang/CharSequence;

    .prologue
    .line 202
    const/4 v0, 0x0

    .line 203
    .local v0, "s":Ljava/lang/String;
    const-string v0, "BEGIN:VEVENT\n"

    .line 204
    if-eqz p0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "SUMMARY:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 205
    :cond_0
    if-eqz p3, :cond_1

    if-eqz p4, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "DTSTART:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    check-cast p3, Ljava/lang/String;

    .end local p3    # "d":Ljava/lang/CharSequence;
    const-string v2, "/"

    const-string v3, ""

    invoke-virtual {p3, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "T"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 206
    check-cast p4, Ljava/lang/String;

    .end local p4    # "t":Ljava/lang/CharSequence;
    const-string v2, ":"

    const-string v3, ""

    invoke-virtual {p4, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "00Z\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 207
    :cond_1
    if-eqz p5, :cond_2

    if-eqz p6, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "DTEND:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    check-cast p5, Ljava/lang/String;

    .end local p5    # "d2":Ljava/lang/CharSequence;
    const-string v2, "/"

    const-string v3, ""

    invoke-virtual {p5, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "T"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 208
    check-cast p6, Ljava/lang/String;

    .end local p6    # "t2":Ljava/lang/CharSequence;
    const-string v2, ":"

    const-string v3, ""

    invoke-virtual {p6, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "00Z\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 209
    :cond_2
    if-eqz p2, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "DESCRIPTION:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 210
    :cond_3
    if-eqz p1, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "LOCATION:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 211
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "END:VEVENT"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 225
    const-string v1, "CALENDAR "

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 227
    return-object v0
.end method

.method public static getImageUri(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/net/Uri;
    .locals 5
    .param p0, "inContext"    # Landroid/content/Context;
    .param p1, "inImage"    # Landroid/graphics/Bitmap;

    .prologue
    const/4 v2, 0x0

    .line 362
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 363
    .local v0, "bytes":Ljava/io/ByteArrayOutputStream;
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x64

    invoke-virtual {p1, v3, v4, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 364
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v4, "Title"

    invoke-static {v3, p1, v4, v2}, Landroid/provider/MediaStore$Images$Media;->insertImage(Landroid/content/ContentResolver;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 365
    .local v1, "path":Ljava/lang/String;
    if-nez v1, :cond_0

    .line 366
    :goto_0
    return-object v2

    :cond_0
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    goto :goto_0
.end method


# virtual methods
.method public changeColor(Ljava/lang/String;ILandroid/widget/ImageView;Landroid/graphics/Bitmap;Lcom/QRBS/activity/MyEncodeActivity;)V
    .locals 6
    .param p1, "s"    # Ljava/lang/String;
    .param p2, "color"    # I
    .param p3, "v"    # Landroid/widget/ImageView;
    .param p4, "activityBmp"    # Landroid/graphics/Bitmap;
    .param p5, "a"    # Lcom/QRBS/activity/MyEncodeActivity;

    .prologue
    .line 57
    new-instance v1, Lcom/scannerfire/utils/Utils;

    invoke-direct {v1}, Lcom/scannerfire/utils/Utils;-><init>()V

    .line 58
    .local v1, "u":Lcom/scannerfire/utils/Utils;
    iget-object v2, p0, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    iget-object v3, p0, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    const v4, 0x7f08010a

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 59
    iget-object v4, p0, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    const v5, 0x7f0800f9

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 58
    invoke-virtual {v1, v2, v3, v4}, Lcom/scannerfire/utils/Utils;->showProgress(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v2

    iput-object v2, p0, Lcom/scannerfire/utils/EncodeUtils;->prog:Landroid/app/ProgressDialog;

    .line 60
    new-instance v0, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;

    invoke-direct {v0, p0, p2, p3, p5}, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;-><init>(Lcom/scannerfire/utils/EncodeUtils;ILandroid/widget/ImageView;Lcom/QRBS/activity/MyEncodeActivity;)V

    .line 61
    .local v0, "t":Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v2}, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 62
    return-void
.end method

.method public generateVcard(Landroid/net/Uri;)[Ljava/lang/String;
    .locals 18
    .param p1, "contactUri"    # Landroid/net/Uri;

    .prologue
    .line 75
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    .line 77
    .local v1, "cr":Landroid/content/ContentResolver;
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v2, p1

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 78
    .local v8, "c":Landroid/database/Cursor;
    const-string v12, ""

    .line 79
    .local v12, "label":Ljava/lang/String;
    new-instance v17, Ljava/lang/StringBuilder;

    invoke-direct/range {v17 .. v17}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .local v17, "sb":Ljava/lang/StringBuilder;
    const-string v3, "MECARD:"

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 111
    const-string v3, ";"

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 113
    const/4 v3, 0x2

    new-array v0, v3, [Ljava/lang/String;

    move-object/from16 v16, v0

    const/4 v3, 0x0

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v16, v3

    const/4 v3, 0x1

    aput-object v12, v16, v3

    .line 114
    .local v16, "ret":[Ljava/lang/String;
    return-object v16

    .line 83
    .end local v16    # "ret":[Ljava/lang/String;
    :cond_0
    const-string v3, "_id"

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 84
    .local v11, "id":Ljava/lang/String;
    const-string v3, "display_name"

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 85
    .local v13, "name":Ljava/lang/String;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 86
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "N:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ";"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    const-string v3, "has_phone_number"

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    if-lez v3, :cond_1

    .line 89
    sget-object v2, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    const/4 v3, 0x0

    const-string v4, "contact_id = ?"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v11, v5, v6

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v14

    .line 90
    .local v14, "pCur":Landroid/database/Cursor;
    :goto_1
    invoke-interface {v14}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-nez v3, :cond_2

    .line 96
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 99
    .end local v14    # "pCur":Landroid/database/Cursor;
    :cond_1
    sget-object v2, Landroid/provider/ContactsContract$CommonDataKinds$Email;->CONTENT_URI:Landroid/net/Uri;

    .line 100
    .local v2, "EmailCONTENT_URI":Landroid/net/Uri;
    const-string v7, "contact_id"

    .line 101
    .local v7, "EmailCONTACT_ID":Ljava/lang/String;
    const/4 v3, 0x0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, " = ?"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v11, v5, v6

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    .line 102
    .local v10, "emailCursor":Landroid/database/Cursor;
    :goto_2
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-nez v3, :cond_3

    .line 108
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    goto/16 :goto_0

    .line 92
    .end local v2    # "EmailCONTENT_URI":Landroid/net/Uri;
    .end local v7    # "EmailCONTACT_ID":Ljava/lang/String;
    .end local v10    # "emailCursor":Landroid/database/Cursor;
    .restart local v14    # "pCur":Landroid/database/Cursor;
    :cond_2
    const-string v3, "data1"

    invoke-interface {v14, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v14, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 93
    .local v15, "phone":Ljava/lang/String;
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "TEL:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ";"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    goto :goto_1

    .line 104
    .end local v14    # "pCur":Landroid/database/Cursor;
    .end local v15    # "phone":Ljava/lang/String;
    .restart local v2    # "EmailCONTENT_URI":Landroid/net/Uri;
    .restart local v7    # "EmailCONTACT_ID":Ljava/lang/String;
    .restart local v10    # "emailCursor":Landroid/database/Cursor;
    :cond_3
    const-string v3, "data1"

    invoke-interface {v10, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v10, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 105
    .local v9, "email":Ljava/lang/String;
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "EMAIL:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ";"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    goto/16 :goto_2
.end method

.method public getCalendars(Landroid/app/Application;J)Ljava/util/List;
    .locals 20
    .param p1, "a"    # Landroid/app/Application;
    .param p2, "id"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "J)",
            "Ljava/util/List",
            "<",
            "Lcom/scannerfire/utils/EncodeUtils$ICal;",
            ">;"
        }
    .end annotation

    .prologue
    .line 232
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 233
    .local v16, "CalList":Ljava/util/List;, "Ljava/util/List<Lcom/scannerfire/utils/EncodeUtils$ICal;>;"
    invoke-virtual/range {p1 .. p1}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v17

    .line 234
    .local v17, "context":Landroid/content/Context;
    invoke-virtual/range {v17 .. v17}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    .line 237
    .local v2, "contentResolver":Landroid/content/ContentResolver;
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "calendar_id="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-wide/from16 v0, p2

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 238
    .local v5, "selection":Ljava/lang/String;
    const-string v3, "content://com.android.calendar/events"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    const/4 v4, 0x6

    new-array v4, v4, [Ljava/lang/String;

    const/4 v6, 0x0

    const-string v7, "calendar_id"

    aput-object v7, v4, v6

    const/4 v6, 0x1

    const-string v7, "title"

    aput-object v7, v4, v6

    const/4 v6, 0x2

    const-string v7, "description"

    aput-object v7, v4, v6

    const/4 v6, 0x3

    const-string v7, "dtstart"

    aput-object v7, v4, v6

    const/4 v6, 0x4

    const-string v7, "dtend"

    aput-object v7, v4, v6

    const/4 v6, 0x5

    const-string v7, "eventLocation"

    aput-object v7, v4, v6

    const/4 v6, 0x0

    const-string v7, "dtstart"

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v18

    .line 239
    .local v18, "cursr":Landroid/database/Cursor;
    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-nez v3, :cond_0

    const/16 v16, 0x0

    .line 248
    .end local v16    # "CalList":Ljava/util/List;, "Ljava/util/List<Lcom/scannerfire/utils/EncodeUtils$ICal;>;"
    :goto_0
    return-object v16

    .line 240
    .restart local v16    # "CalList":Ljava/util/List;, "Ljava/util/List<Lcom/scannerfire/utils/EncodeUtils$ICal;>;"
    :cond_0
    const/16 v19, 0x0

    .local v19, "i":I
    :goto_1
    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->getCount()I

    move-result v3

    move/from16 v0, v19

    if-lt v0, v3, :cond_1

    .line 246
    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 242
    :cond_1
    new-instance v7, Lcom/scannerfire/utils/EncodeUtils$ICal;

    const/4 v3, 0x1

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    const/4 v3, 0x5

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    const/4 v3, 0x2

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    const/4 v3, 0x3

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v12

    const/4 v3, 0x4

    move-object/from16 v0, v18

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    move-object/from16 v8, p0

    invoke-direct/range {v7 .. v15}, Lcom/scannerfire/utils/EncodeUtils$ICal;-><init>(Lcom/scannerfire/utils/EncodeUtils;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    move-object/from16 v0, v16

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 243
    const-string v3, ""

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "ID -> "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x0

    move-object/from16 v0, v18

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 244
    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->moveToNext()Z

    .line 240
    add-int/lit8 v19, v19, 0x1

    goto :goto_1
.end method

.method public getCalendarsSel(Landroid/app/Application;)Ljava/util/List;
    .locals 14
    .param p1, "a"    # Landroid/app/Application;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/scannerfire/utils/EncodeUtils$CalSel;",
            ">;"
        }
    .end annotation

    .prologue
    .line 253
    const/4 v1, 0x2

    new-array v6, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    .line 254
    const-string v3, "_id"

    aput-object v3, v6, v1

    const/4 v1, 0x1

    .line 255
    const-string v3, "calendar_displayName"

    aput-object v3, v6, v1

    .line 260
    .local v6, "EVENT_PROJECTION":[Ljava/lang/String;
    const/4 v1, 0x2

    new-array v7, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    .line 261
    const-string v3, "_id"

    aput-object v3, v7, v1

    const/4 v1, 0x1

    .line 262
    const-string v3, "displayName"

    aput-object v3, v7, v1

    .line 265
    .local v7, "EVENT_PROJECTION_2":[Ljava/lang/String;
    move-object v2, v7

    .line 266
    .local v2, "projection":[Ljava/lang/String;
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-lt v1, v3, :cond_0

    .line 267
    move-object v2, v6

    .line 269
    :cond_0
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 270
    .local v12, "list":Ljava/util/List;, "Ljava/util/List<Lcom/scannerfire/utils/EncodeUtils$CalSel;>;"
    invoke-virtual {p1}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v8

    .line 271
    .local v8, "context":Landroid/content/Context;
    invoke-virtual {v8}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 272
    .local v0, "contentResolver":Landroid/content/ContentResolver;
    const-string v1, "content://com.android.calendar/calendars"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 276
    .local v9, "cursr":Landroid/database/Cursor;
    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_1

    .line 282
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 283
    return-object v12

    .line 277
    :cond_1
    const-string v1, ""

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CALSEL OBJECT\n 0="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-interface {v9, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\n 1="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const/4 v4, 0x1

    invoke-interface {v9, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 278
    const/4 v1, 0x0

    invoke-interface {v9, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v10

    .line 279
    .local v10, "id":J
    const/4 v1, 0x1

    invoke-interface {v9, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 280
    .local v13, "s":Ljava/lang/String;
    new-instance v1, Lcom/scannerfire/utils/EncodeUtils$CalSel;

    invoke-direct {v1, p0, v10, v11, v13}, Lcom/scannerfire/utils/EncodeUtils$CalSel;-><init>(Lcom/scannerfire/utils/EncodeUtils;JLjava/lang/String;)V

    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public getEmail(Landroid/net/Uri;)[Ljava/lang/String;
    .locals 9
    .param p1, "contactUri"    # Landroid/net/Uri;

    .prologue
    const/4 v2, 0x0

    .line 171
    iget-object v0, p0, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v1, p1

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 172
    .local v6, "c":Landroid/database/Cursor;
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    .line 173
    const-string v0, "data1"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 174
    .local v7, "mail":Ljava/lang/String;
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 176
    const/4 v0, 0x2

    new-array v8, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mailto:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v8, v0

    const/4 v0, 0x1

    aput-object v7, v8, v0

    .line 177
    .local v8, "ret":[Ljava/lang/String;
    return-object v8
.end method

.method public getNameEmailDetails(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 13
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v12, 0x3

    const/4 v11, 0x1

    .line 134
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 135
    .local v8, "emlRecs":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 136
    .local v9, "emlRecsHS":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 137
    .local v0, "cr":Landroid/content/ContentResolver;
    const/4 v1, 0x5

    new-array v2, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v4, "_id"

    aput-object v4, v2, v1

    .line 138
    const-string v1, "display_name"

    aput-object v1, v2, v11

    const/4 v1, 0x2

    .line 139
    const-string v4, "photo_id"

    aput-object v4, v2, v1

    .line 140
    const-string v1, "data1"

    aput-object v1, v2, v12

    const/4 v1, 0x4

    .line 141
    const-string v4, "contact_id"

    aput-object v4, v2, v1

    .line 142
    .local v2, "PROJECTION":[Ljava/lang/String;
    const-string v5, "CASE WHEN display_name NOT LIKE \'%@%\' THEN 1 ELSE 2 END, display_name, data1 COLLATE NOCASE"

    .line 149
    .local v5, "order":Ljava/lang/String;
    const-string v3, "data1 NOT LIKE \'\'"

    .line 150
    .local v3, "filter":Ljava/lang/String;
    sget-object v1, Landroid/provider/ContactsContract$CommonDataKinds$Email;->CONTENT_URI:Landroid/net/Uri;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 151
    .local v6, "cur":Landroid/database/Cursor;
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 154
    :cond_0
    invoke-interface {v6, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 155
    .local v10, "name":Ljava/lang/String;
    invoke-interface {v6, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 158
    .local v7, "emlAddr":Ljava/lang/String;
    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 159
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    :cond_1
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_0

    .line 164
    .end local v7    # "emlAddr":Ljava/lang/String;
    .end local v10    # "name":Ljava/lang/String;
    :cond_2
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 165
    return-object v8
.end method

.method public getTel(Landroid/net/Uri;)[Ljava/lang/String;
    .locals 10
    .param p1, "contactUri"    # Landroid/net/Uri;

    .prologue
    const/4 v2, 0x0

    .line 120
    iget-object v0, p0, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v1, p1

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 121
    .local v6, "c":Landroid/database/Cursor;
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    .line 122
    const-string v0, "data1"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v8

    .line 124
    .local v8, "numindex":I
    invoke-interface {v6, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 125
    .local v7, "num":Ljava/lang/String;
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 127
    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "tel:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v9, v0

    const/4 v0, 0x1

    aput-object v7, v9, v0

    .line 128
    .local v9, "ret":[Ljava/lang/String;
    return-object v9
.end method

.method public share(Ljava/lang/String;)V
    .locals 6
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 65
    new-instance v1, Lcom/scannerfire/utils/Utils;

    invoke-direct {v1}, Lcom/scannerfire/utils/Utils;-><init>()V

    .line 66
    .local v1, "u":Lcom/scannerfire/utils/Utils;
    iget-object v2, p0, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    iget-object v3, p0, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    const v4, 0x7f08010a

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 67
    iget-object v4, p0, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    const v5, 0x7f0800f9

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 66
    invoke-virtual {v1, v2, v3, v4}, Lcom/scannerfire/utils/Utils;->showProgress(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v2

    iput-object v2, p0, Lcom/scannerfire/utils/EncodeUtils;->prog:Landroid/app/ProgressDialog;

    .line 68
    new-instance v0, Lcom/scannerfire/utils/EncodeUtils$ShareTask;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/scannerfire/utils/EncodeUtils$ShareTask;-><init>(Lcom/scannerfire/utils/EncodeUtils;Lcom/scannerfire/utils/EncodeUtils$ShareTask;)V

    .line 69
    .local v0, "t":Lcom/scannerfire/utils/EncodeUtils$ShareTask;
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v2}, Lcom/scannerfire/utils/EncodeUtils$ShareTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 70
    return-void
.end method

.method public start(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .param p1, "s"    # Ljava/lang/String;
    .param p2, "label"    # Ljava/lang/String;

    .prologue
    .line 49
    new-instance v1, Lcom/scannerfire/utils/Utils;

    invoke-direct {v1}, Lcom/scannerfire/utils/Utils;-><init>()V

    .line 50
    .local v1, "u":Lcom/scannerfire/utils/Utils;
    iget-object v2, p0, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    iget-object v3, p0, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    const v4, 0x7f08010a

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 51
    iget-object v4, p0, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    const v5, 0x7f0800f9

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 50
    invoke-virtual {v1, v2, v3, v4}, Lcom/scannerfire/utils/Utils;->showProgress(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v2

    iput-object v2, p0, Lcom/scannerfire/utils/EncodeUtils;->prog:Landroid/app/ProgressDialog;

    .line 52
    new-instance v0, Lcom/scannerfire/utils/EncodeUtils$EncodeTask;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/scannerfire/utils/EncodeUtils$EncodeTask;-><init>(Lcom/scannerfire/utils/EncodeUtils;Lcom/scannerfire/utils/EncodeUtils$EncodeTask;)V

    .line 53
    .local v0, "t":Lcom/scannerfire/utils/EncodeUtils$EncodeTask;
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-virtual {v0, v2}, Lcom/scannerfire/utils/EncodeUtils$EncodeTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 54
    return-void
.end method
