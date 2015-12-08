.class public Lcom/googlecode/flickrjandroid/people/User;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/flickrjandroid/util/BuddyIconable;
.implements Ljava/io/Serializable;


# static fields
.field private static final DATE_FORMATS:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/text/DateFormat;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0xcL


# instance fields
.field private admin:Z

.field private bandwidth:Lcom/googlecode/flickrjandroid/people/Bandwidth;

.field private faveDate:Ljava/util/Date;

.field private filesizeMax:J

.field private iconFarm:I

.field private iconServer:I

.field private id:Ljava/lang/String;

.field private location:Ljava/lang/String;

.field private mbox_sha1sum:Ljava/lang/String;

.field private mobileurl:Ljava/lang/String;

.field private pathAlias:Ljava/lang/String;

.field private photosCount:I

.field private photosFirstDate:Ljava/util/Date;

.field private photosFirstDateTaken:Ljava/util/Date;

.field private photosurl:Ljava/lang/String;

.field private pro:Z

.field private profileurl:Ljava/lang/String;

.field private realName:Ljava/lang/String;

.field private revContact:Z

.field private revFamily:Z

.field private revFriend:Z

.field private username:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    new-instance v0, Lcom/googlecode/flickrjandroid/people/a;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/people/a;-><init>()V

    sput-object v0, Lcom/googlecode/flickrjandroid/people/User;->DATE_FORMATS:Ljava/lang/ThreadLocal;

    .line 30
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 302
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    .line 355
    :cond_0
    :goto_0
    return v3

    .line 306
    :cond_1
    check-cast p1, Lcom/googlecode/flickrjandroid/people/User;

    .line 307
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 308
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v4

    move v2, v3

    .line 309
    :goto_1
    array-length v0, v4

    if-lt v2, v0, :cond_2

    .line 355
    const/4 v3, 0x1

    goto :goto_0

    .line 310
    :cond_2
    sget-object v0, Lcom/googlecode/flickrjandroid/util/StringUtilities;->getterPattern:Ljava/util/regex/Pattern;

    aget-object v1, v4, v2

    .line 311
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    .line 310
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 312
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_3

    aget-object v0, v4, v2

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getClass"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 314
    :try_start_0
    aget-object v0, v4, v2

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 315
    aget-object v1, v4, v2

    const/4 v5, 0x0

    invoke-virtual {v1, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 316
    aget-object v5, v4, v2

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v5

    .line 317
    const-string v6, "class"

    invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    if-nez v6, :cond_6

    .line 318
    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    .line 319
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 309
    :cond_3
    :goto_2
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 322
    :cond_4
    if-nez v0, :cond_5

    if-eqz v1, :cond_3

    .line 324
    :cond_5
    if-eqz v0, :cond_0

    if-nez v1, :cond_3

    goto :goto_0

    .line 329
    :cond_6
    const-string v6, "int"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 330
    check-cast v0, Ljava/lang/Integer;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    .line 332
    :cond_7
    const-string v6, "boolean"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 333
    check-cast v0, Ljava/lang/Boolean;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    .line 335
    :cond_8
    const-string v6, "long"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 336
    check-cast v0, Ljava/lang/Long;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    .line 339
    :cond_9
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "User#equals() missing type "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 340
    aget-object v5, v4, v2

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "|"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 341
    aget-object v5, v4, v2

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 339
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_2

    .line 343
    :catch_0
    move-exception v0

    .line 344
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "equals "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v6, v4, v2

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 345
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 344
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 349
    :catch_1
    move-exception v0

    .line 350
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "equals "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v6, v4, v2

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 351
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 350
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 346
    :catch_2
    move-exception v0

    goto/16 :goto_2
.end method

.method public getBandwidth()Lcom/googlecode/flickrjandroid/people/Bandwidth;
    .locals 1

    .prologue
    .line 263
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/people/User;->bandwidth:Lcom/googlecode/flickrjandroid/people/Bandwidth;

    return-object v0
.end method

.method public getBuddyIconUrl()Ljava/lang/String;
    .locals 3

    .prologue
    .line 156
    iget v0, p0, Lcom/googlecode/flickrjandroid/people/User;->iconFarm:I

    iget v1, p0, Lcom/googlecode/flickrjandroid/people/User;->iconServer:I

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/people/User;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/googlecode/flickrjandroid/util/UrlUtilities;->createBuddyIconUrl(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getFaveDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 237
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/people/User;->faveDate:Ljava/util/Date;

    return-object v0
.end method

.method public getFilesizeMax()J
    .locals 2

    .prologue
    .line 275
    iget-wide v0, p0, Lcom/googlecode/flickrjandroid/people/User;->filesizeMax:J

    return-wide v0
.end method

.method public getIconFarm()I
    .locals 1

    .prologue
    .line 92
    iget v0, p0, Lcom/googlecode/flickrjandroid/people/User;->iconFarm:I

    return v0
.end method

.method public getIconServer()I
    .locals 1

    .prologue
    .line 105
    iget v0, p0, Lcom/googlecode/flickrjandroid/people/User;->iconServer:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/people/User;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getLocation()Ljava/lang/String;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/people/User;->location:Ljava/lang/String;

    return-object v0
.end method

.method public getMbox_sha1sum()Ljava/lang/String;
    .locals 1

    .prologue
    .line 297
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/people/User;->mbox_sha1sum:Ljava/lang/String;

    return-object v0
.end method

.method public getMobileurl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 438
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/people/User;->mobileurl:Ljava/lang/String;

    return-object v0
.end method

.method public getPathAlias()Ljava/lang/String;
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/people/User;->pathAlias:Ljava/lang/String;

    return-object v0
.end method

.method public getPhotosCount()I
    .locals 1

    .prologue
    .line 241
    iget v0, p0, Lcom/googlecode/flickrjandroid/people/User;->photosCount:I

    return v0
.end method

.method public getPhotosFirstDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/people/User;->photosFirstDate:Ljava/util/Date;

    return-object v0
.end method

.method public getPhotosFirstDateTaken()Ljava/util/Date;
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/people/User;->photosFirstDateTaken:Ljava/util/Date;

    return-object v0
.end method

.method public getPhotosurl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 408
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/people/User;->photosurl:Ljava/lang/String;

    return-object v0
.end method

.method public getProfileurl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 423
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/people/User;->profileurl:Ljava/lang/String;

    return-object v0
.end method

.method public getRealName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/people/User;->realName:Ljava/lang/String;

    return-object v0
.end method

.method public getUsername()Ljava/lang/String;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/people/User;->username:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 363
    const/4 v1, 0x1

    .line 364
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 365
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v4

    .line 366
    const/4 v0, 0x0

    move v2, v1

    move v1, v0

    :goto_0
    array-length v0, v4

    if-lt v1, v0, :cond_0

    .line 401
    return v2

    .line 367
    :cond_0
    sget-object v0, Lcom/googlecode/flickrjandroid/util/StringUtilities;->getterPattern:Ljava/util/regex/Pattern;

    aget-object v5, v4, v1

    .line 368
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    .line 367
    invoke-virtual {v0, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 369
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_1

    aget-object v0, v4, v1

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v5, "getClass"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 372
    :try_start_0
    aget-object v0, v4, v1

    const/4 v5, 0x0

    invoke-virtual {v0, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 380
    :goto_1
    if-eqz v0, :cond_1

    .line 381
    instance-of v5, v0, Ljava/lang/Boolean;

    if-eqz v5, :cond_2

    .line 382
    check-cast v0, Ljava/lang/Boolean;

    .line 383
    invoke-virtual {v0}, Ljava/lang/Boolean;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    .line 366
    :cond_1
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 373
    :catch_0
    move-exception v0

    .line 374
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "hashCode "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v7, v4, v1

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 375
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 374
    invoke-virtual {v5, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    move-object v0, v3

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v0, v3

    goto :goto_1

    .line 384
    :cond_2
    instance-of v5, v0, Ljava/lang/Integer;

    if-eqz v5, :cond_3

    .line 385
    check-cast v0, Ljava/lang/Integer;

    .line 386
    invoke-virtual {v0}, Ljava/lang/Integer;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    .line 387
    goto :goto_2

    :cond_3
    instance-of v5, v0, Ljava/lang/String;

    if-eqz v5, :cond_4

    .line 388
    check-cast v0, Ljava/lang/String;

    .line 389
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    .line 390
    goto :goto_2

    :cond_4
    instance-of v5, v0, Ljava/lang/Long;

    if-eqz v5, :cond_5

    .line 391
    check-cast v0, Ljava/lang/Long;

    .line 392
    invoke-virtual {v0}, Ljava/lang/Long;->hashCode()I

    move-result v0

    add-int/2addr v2, v0

    .line 393
    goto :goto_2

    .line 394
    :cond_5
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 395
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "User hashCode unrecognised object: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 396
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 395
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_2
.end method

.method public isAdmin()Z
    .locals 1

    .prologue
    .line 76
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/people/User;->admin:Z

    return v0
.end method

.method public isPro()Z
    .locals 1

    .prologue
    .line 84
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/people/User;->pro:Z

    return v0
.end method

.method public isRevContact()Z
    .locals 1

    .prologue
    .line 454
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/people/User;->revContact:Z

    return v0
.end method

.method public isRevFamily()Z
    .locals 1

    .prologue
    .line 470
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/people/User;->revFamily:Z

    return v0
.end method

.method public isRevFriend()Z
    .locals 1

    .prologue
    .line 462
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/people/User;->revFriend:Z

    return v0
.end method

.method public setAdmin(Z)V
    .locals 0

    .prologue
    .line 80
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/people/User;->admin:Z

    .line 81
    return-void
.end method

.method public setBandwidth(Lcom/googlecode/flickrjandroid/people/Bandwidth;)V
    .locals 0

    .prologue
    .line 271
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/people/User;->bandwidth:Lcom/googlecode/flickrjandroid/people/Bandwidth;

    .line 272
    return-void
.end method

.method public setFaveDate(J)V
    .locals 1

    .prologue
    .line 214
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/people/User;->setFaveDate(Ljava/util/Date;)V

    .line 215
    return-void
.end method

.method public setFaveDate(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 207
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lcom/googlecode/flickrjandroid/people/User;->setFaveDate(J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setFaveDate(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 225
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/people/User;->faveDate:Ljava/util/Date;

    .line 226
    return-void
.end method

.method public setFilesizeMax(J)V
    .locals 1

    .prologue
    .line 279
    iput-wide p1, p0, Lcom/googlecode/flickrjandroid/people/User;->filesizeMax:J

    .line 280
    return-void
.end method

.method public setFilesizeMax(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 283
    if-eqz p1, :cond_0

    .line 285
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/googlecode/flickrjandroid/people/User;->setFilesizeMax(J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 290
    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setIconFarm(I)V
    .locals 0

    .prologue
    .line 96
    iput p1, p0, Lcom/googlecode/flickrjandroid/people/User;->iconFarm:I

    .line 97
    return-void
.end method

.method public setIconFarm(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 100
    if-eqz p1, :cond_0

    .line 101
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/people/User;->setIconFarm(I)V

    .line 102
    :cond_0
    return-void
.end method

.method public setIconServer(I)V
    .locals 0

    .prologue
    .line 109
    iput p1, p0, Lcom/googlecode/flickrjandroid/people/User;->iconServer:I

    .line 110
    return-void
.end method

.method public setIconServer(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 113
    if-eqz p1, :cond_0

    .line 114
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/people/User;->setIconServer(I)V

    .line 115
    :cond_0
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/people/User;->id:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public setLocation(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 160
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/people/User;->location:Ljava/lang/String;

    .line 161
    return-void
.end method

.method public setMbox_sha1sum(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 293
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/people/User;->mbox_sha1sum:Ljava/lang/String;

    .line 294
    return-void
.end method

.method public setMobileurl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 446
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/people/User;->mobileurl:Ljava/lang/String;

    .line 447
    return-void
.end method

.method public setPathAlias(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 141
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/people/User;->pathAlias:Ljava/lang/String;

    .line 142
    return-void
.end method

.method public setPhotosCount(I)V
    .locals 0

    .prologue
    .line 245
    iput p1, p0, Lcom/googlecode/flickrjandroid/people/User;->photosCount:I

    .line 246
    return-void
.end method

.method public setPhotosCount(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 249
    if-eqz p1, :cond_0

    .line 251
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 252
    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/people/User;->setPhotosCount(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 257
    :cond_0
    :goto_0
    return-void

    .line 254
    :catch_0
    move-exception v0

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/people/User;->setPhotosCount(I)V

    goto :goto_0
.end method

.method public setPhotosFirstDate(J)V
    .locals 1

    .prologue
    .line 172
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/people/User;->setPhotosFirstDate(Ljava/util/Date;)V

    .line 173
    return-void
.end method

.method public setPhotosFirstDate(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 176
    if-eqz p1, :cond_0

    .line 178
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 179
    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    .line 178
    invoke-virtual {p0, v0, v1}, Lcom/googlecode/flickrjandroid/people/User;->setPhotosFirstDate(J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setPhotosFirstDate(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 168
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/people/User;->photosFirstDate:Ljava/util/Date;

    .line 169
    return-void
.end method

.method public setPhotosFirstDateTaken(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 194
    if-eqz p1, :cond_0

    .line 196
    :try_start_0
    sget-object v0, Lcom/googlecode/flickrjandroid/people/User;->DATE_FORMATS:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/DateFormat;

    .line 197
    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 196
    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/people/User;->setPhotosFirstDateTaken(Ljava/util/Date;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    :cond_0
    :goto_0
    return-void

    .line 200
    :catch_0
    move-exception v0

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/people/User;->setPhotosFirstDateTaken(Ljava/util/Date;)V

    goto :goto_0
.end method

.method public setPhotosFirstDateTaken(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 190
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/people/User;->photosFirstDateTaken:Ljava/util/Date;

    .line 191
    return-void
.end method

.method public setPhotosurl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 416
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/people/User;->photosurl:Ljava/lang/String;

    .line 417
    return-void
.end method

.method public setPro(Z)V
    .locals 0

    .prologue
    .line 88
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/people/User;->pro:Z

    .line 89
    return-void
.end method

.method public setProfileurl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 431
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/people/User;->profileurl:Ljava/lang/String;

    .line 432
    return-void
.end method

.method public setRealName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 122
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/people/User;->realName:Ljava/lang/String;

    .line 123
    return-void
.end method

.method public setRevContact(Z)V
    .locals 0

    .prologue
    .line 450
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/people/User;->revContact:Z

    .line 451
    return-void
.end method

.method public setRevFamily(Z)V
    .locals 0

    .prologue
    .line 466
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/people/User;->revFamily:Z

    .line 467
    return-void
.end method

.method public setRevFriend(Z)V
    .locals 0

    .prologue
    .line 458
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/people/User;->revFriend:Z

    .line 459
    return-void
.end method

.method public setUsername(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/people/User;->username:Ljava/lang/String;

    .line 73
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 480
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "User [id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/people/User;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", username="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/people/User;->username:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
