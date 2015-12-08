.class Lorg/chromium/base/CommandLine$JavaCommandLine;
.super Lorg/chromium/base/CommandLine;
.source "CommandLine.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/base/CommandLine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "JavaCommandLine"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private mArgs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mArgsBegin:I

.field private mSwitches:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 251
    const-class v0, Lorg/chromium/base/CommandLine;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/base/CommandLine$JavaCommandLine;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>([Ljava/lang/String;)V
    .locals 3
    .param p1, "args"    # [Ljava/lang/String;

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 258
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/chromium/base/CommandLine;-><init>(Lorg/chromium/base/CommandLine$1;)V

    .line 252
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/chromium/base/CommandLine$JavaCommandLine;->mSwitches:Ljava/util/HashMap;

    .line 253
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/chromium/base/CommandLine$JavaCommandLine;->mArgs:Ljava/util/ArrayList;

    .line 256
    iput v2, p0, Lorg/chromium/base/CommandLine$JavaCommandLine;->mArgsBegin:I

    .line 259
    if-eqz p1, :cond_0

    array-length v0, p1

    if-eqz v0, :cond_0

    aget-object v0, p1, v1

    if-nez v0, :cond_1

    .line 260
    :cond_0
    iget-object v0, p0, Lorg/chromium/base/CommandLine$JavaCommandLine;->mArgs:Ljava/util/ArrayList;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 266
    :goto_0
    sget-boolean v0, Lorg/chromium/base/CommandLine$JavaCommandLine;->$assertionsDisabled:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lorg/chromium/base/CommandLine$JavaCommandLine;->mArgs:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 262
    :cond_1
    iget-object v0, p0, Lorg/chromium/base/CommandLine$JavaCommandLine;->mArgs:Ljava/util/ArrayList;

    aget-object v1, p1, v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    invoke-direct {p0, p1, v2}, Lorg/chromium/base/CommandLine$JavaCommandLine;->appendSwitchesInternal([Ljava/lang/String;I)V

    goto :goto_0

    .line 267
    :cond_2
    return-void
.end method

.method static synthetic access$100(Lorg/chromium/base/CommandLine$JavaCommandLine;)[Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/base/CommandLine$JavaCommandLine;

    .prologue
    .line 251
    invoke-direct {p0}, Lorg/chromium/base/CommandLine$JavaCommandLine;->getCommandLineArguments()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private appendSwitchesInternal([Ljava/lang/String;I)V
    .locals 10
    .param p1, "array"    # [Ljava/lang/String;
    .param p2, "skipCount"    # I

    .prologue
    const/4 v9, 0x1

    .line 319
    const/4 v4, 0x1

    .line 320
    .local v4, "parseSwitches":Z
    move-object v1, p1

    .local v1, "arr$":[Ljava/lang/String;
    array-length v3, v1

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_4

    aget-object v0, v1, v2

    .line 321
    .local v0, "arg":Ljava/lang/String;
    if-lez p2, :cond_0

    .line 322
    add-int/lit8 p2, p2, -0x1

    .line 320
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 326
    :cond_0
    const-string v7, "--"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 327
    const/4 v4, 0x0

    .line 330
    :cond_1
    if-eqz v4, :cond_3

    const-string v7, "--"

    invoke-virtual {v0, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 331
    const-string v7, "="

    const/4 v8, 0x2

    invoke-virtual {v0, v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v5

    .line 332
    .local v5, "parts":[Ljava/lang/String;
    array-length v7, v5

    if-le v7, v9, :cond_2

    aget-object v6, v5, v9

    .line 333
    .local v6, "value":Ljava/lang/String;
    :goto_2
    const/4 v7, 0x0

    aget-object v7, v5, v7

    const-string v8, "--"

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v7, v6}, Lorg/chromium/base/CommandLine$JavaCommandLine;->appendSwitchWithValue(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 332
    .end local v6    # "value":Ljava/lang/String;
    :cond_2
    const/4 v6, 0x0

    goto :goto_2

    .line 335
    .end local v5    # "parts":[Ljava/lang/String;
    :cond_3
    iget-object v7, p0, Lorg/chromium/base/CommandLine$JavaCommandLine;->mArgs:Ljava/util/ArrayList;

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 338
    .end local v0    # "arg":Ljava/lang/String;
    :cond_4
    return-void
.end method

.method private getCommandLineArguments()[Ljava/lang/String;
    .locals 2

    .prologue
    .line 274
    iget-object v0, p0, Lorg/chromium/base/CommandLine$JavaCommandLine;->mArgs:Ljava/util/ArrayList;

    iget-object v1, p0, Lorg/chromium/base/CommandLine$JavaCommandLine;->mArgs:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public appendSwitch(Ljava/lang/String;)V
    .locals 1
    .param p1, "switchString"    # Ljava/lang/String;

    .prologue
    .line 292
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lorg/chromium/base/CommandLine$JavaCommandLine;->appendSwitchWithValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    return-void
.end method

.method public appendSwitchWithValue(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "switchString"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 302
    iget-object v2, p0, Lorg/chromium/base/CommandLine$JavaCommandLine;->mSwitches:Ljava/util/HashMap;

    if-nez p2, :cond_1

    const-string v1, ""

    :goto_0
    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "--"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 306
    .local v0, "combinedSwitchString":Ljava/lang/String;
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 307
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 309
    :cond_0
    iget-object v1, p0, Lorg/chromium/base/CommandLine$JavaCommandLine;->mArgs:Ljava/util/ArrayList;

    iget v2, p0, Lorg/chromium/base/CommandLine$JavaCommandLine;->mArgsBegin:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/chromium/base/CommandLine$JavaCommandLine;->mArgsBegin:I

    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 310
    return-void

    .end local v0    # "combinedSwitchString":Ljava/lang/String;
    :cond_1
    move-object v1, p2

    .line 302
    goto :goto_0
.end method

.method public appendSwitchesAndArguments([Ljava/lang/String;)V
    .locals 1
    .param p1, "array"    # [Ljava/lang/String;

    .prologue
    .line 314
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/chromium/base/CommandLine$JavaCommandLine;->appendSwitchesInternal([Ljava/lang/String;I)V

    .line 315
    return-void
.end method

.method public getSwitchValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "switchString"    # Ljava/lang/String;

    .prologue
    .line 286
    iget-object v1, p0, Lorg/chromium/base/CommandLine$JavaCommandLine;->mSwitches:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 287
    .local v0, "value":Ljava/lang/String;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    .end local v0    # "value":Ljava/lang/String;
    :cond_1
    return-object v0
.end method

.method public hasSwitch(Ljava/lang/String;)Z
    .locals 1
    .param p1, "switchString"    # Ljava/lang/String;

    .prologue
    .line 279
    iget-object v0, p0, Lorg/chromium/base/CommandLine$JavaCommandLine;->mSwitches:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
