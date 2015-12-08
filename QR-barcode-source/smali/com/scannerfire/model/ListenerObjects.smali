.class public Lcom/scannerfire/model/ListenerObjects;
.super Ljava/lang/Object;
.source "ListenerObjects.java"


# static fields
.field private static synthetic $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE:[I


# instance fields
.field biz:Lcom/scannerfire/model/BizCard;

.field browser:Landroid/view/View$OnClickListener;

.field calendar:Landroid/view/View$OnClickListener;

.field contact:Landroid/view/View$OnClickListener;

.field context:Landroid/app/Activity;

.field email:Landroid/view/View$OnClickListener;

.field geo:Landroid/view/View$OnClickListener;

.field isbn:Landroid/view/View$OnClickListener;

.field matMsg:Lcom/scannerfire/model/MatMsg;

.field msg:Lcom/scannerfire/model/Mail;

.field phone:Landroid/view/View$OnClickListener;

.field product:Landroid/view/View$OnClickListener;

.field text:Landroid/view/View$OnClickListener;

.field value:Ljava/lang/String;


# direct methods
.method static synthetic $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()[I
    .locals 3

    .prologue
    .line 22
    sget-object v0, Lcom/scannerfire/model/ListenerObjects;->$SWITCH_TABLE$com$scannerfire$utils$Utils$MODE:[I

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
    sput-object v0, Lcom/scannerfire/model/ListenerObjects;->$SWITCH_TABLE$com$scannerfire$utils$Utils$MODE:[I

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
    .locals 1
    .param p1, "context"    # Landroid/app/Activity;

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    new-instance v0, Lcom/scannerfire/model/ListenerObjects$1;

    invoke-direct {v0, p0}, Lcom/scannerfire/model/ListenerObjects$1;-><init>(Lcom/scannerfire/model/ListenerObjects;)V

    iput-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->browser:Landroid/view/View$OnClickListener;

    .line 116
    new-instance v0, Lcom/scannerfire/model/ListenerObjects$2;

    invoke-direct {v0, p0}, Lcom/scannerfire/model/ListenerObjects$2;-><init>(Lcom/scannerfire/model/ListenerObjects;)V

    iput-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->email:Landroid/view/View$OnClickListener;

    .line 139
    new-instance v0, Lcom/scannerfire/model/ListenerObjects$3;

    invoke-direct {v0, p0}, Lcom/scannerfire/model/ListenerObjects$3;-><init>(Lcom/scannerfire/model/ListenerObjects;)V

    iput-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->text:Landroid/view/View$OnClickListener;

    .line 146
    new-instance v0, Lcom/scannerfire/model/ListenerObjects$4;

    invoke-direct {v0, p0}, Lcom/scannerfire/model/ListenerObjects$4;-><init>(Lcom/scannerfire/model/ListenerObjects;)V

    iput-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->phone:Landroid/view/View$OnClickListener;

    .line 155
    new-instance v0, Lcom/scannerfire/model/ListenerObjects$5;

    invoke-direct {v0, p0}, Lcom/scannerfire/model/ListenerObjects$5;-><init>(Lcom/scannerfire/model/ListenerObjects;)V

    iput-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->contact:Landroid/view/View$OnClickListener;

    .line 245
    new-instance v0, Lcom/scannerfire/model/ListenerObjects$6;

    invoke-direct {v0, p0}, Lcom/scannerfire/model/ListenerObjects$6;-><init>(Lcom/scannerfire/model/ListenerObjects;)V

    iput-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->geo:Landroid/view/View$OnClickListener;

    .line 269
    new-instance v0, Lcom/scannerfire/model/ListenerObjects$7;

    invoke-direct {v0, p0}, Lcom/scannerfire/model/ListenerObjects$7;-><init>(Lcom/scannerfire/model/ListenerObjects;)V

    iput-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->calendar:Landroid/view/View$OnClickListener;

    .line 341
    new-instance v0, Lcom/scannerfire/model/ListenerObjects$8;

    invoke-direct {v0, p0}, Lcom/scannerfire/model/ListenerObjects$8;-><init>(Lcom/scannerfire/model/ListenerObjects;)V

    iput-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->product:Landroid/view/View$OnClickListener;

    .line 350
    new-instance v0, Lcom/scannerfire/model/ListenerObjects$9;

    invoke-direct {v0, p0}, Lcom/scannerfire/model/ListenerObjects$9;-><init>(Lcom/scannerfire/model/ListenerObjects;)V

    iput-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->isbn:Landroid/view/View$OnClickListener;

    .line 30
    iput-object p1, p0, Lcom/scannerfire/model/ListenerObjects;->context:Landroid/app/Activity;

    .line 31
    return-void
.end method


# virtual methods
.method public getBiz()Lcom/scannerfire/model/BizCard;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->biz:Lcom/scannerfire/model/BizCard;

    return-object v0
.end method

.method public getMatMsg()Lcom/scannerfire/model/MatMsg;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->matMsg:Lcom/scannerfire/model/MatMsg;

    return-object v0
.end method

.method public getMsg()Lcom/scannerfire/model/Mail;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->msg:Lcom/scannerfire/model/Mail;

    return-object v0
.end method

.method public getOnClickListener(Lcom/scannerfire/utils/Utils$MODE;)Landroid/view/View$OnClickListener;
    .locals 4
    .param p1, "m"    # Lcom/scannerfire/utils/Utils$MODE;

    .prologue
    .line 66
    const/4 v0, 0x0

    .line 67
    .local v0, "list":Landroid/view/View$OnClickListener;
    const-string v1, ""

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "MODE IS: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    invoke-static {}, Lcom/scannerfire/model/ListenerObjects;->$SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()[I

    move-result-object v1

    invoke-virtual {p1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 100
    :goto_0
    return-object v0

    .line 70
    :pswitch_0
    iget-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->contact:Landroid/view/View$OnClickListener;

    .line 71
    goto :goto_0

    .line 73
    :pswitch_1
    iget-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->email:Landroid/view/View$OnClickListener;

    .line 74
    goto :goto_0

    .line 76
    :pswitch_2
    iget-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->geo:Landroid/view/View$OnClickListener;

    .line 77
    goto :goto_0

    .line 79
    :pswitch_3
    iget-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->phone:Landroid/view/View$OnClickListener;

    .line 80
    goto :goto_0

    .line 82
    :pswitch_4
    iget-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->text:Landroid/view/View$OnClickListener;

    .line 83
    goto :goto_0

    .line 85
    :pswitch_5
    iget-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->browser:Landroid/view/View$OnClickListener;

    .line 86
    goto :goto_0

    .line 88
    :pswitch_6
    iget-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->calendar:Landroid/view/View$OnClickListener;

    .line 89
    goto :goto_0

    .line 92
    :pswitch_7
    iget-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->product:Landroid/view/View$OnClickListener;

    .line 93
    goto :goto_0

    .line 96
    :pswitch_8
    iget-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->isbn:Landroid/view/View$OnClickListener;

    goto :goto_0

    .line 68
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_3
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/scannerfire/model/ListenerObjects;->value:Ljava/lang/String;

    return-object v0
.end method

.method public setBiz(Lcom/scannerfire/model/BizCard;)V
    .locals 0
    .param p1, "biz"    # Lcom/scannerfire/model/BizCard;

    .prologue
    .line 62
    iput-object p1, p0, Lcom/scannerfire/model/ListenerObjects;->biz:Lcom/scannerfire/model/BizCard;

    .line 63
    return-void
.end method

.method public setMatMsg(Lcom/scannerfire/model/MatMsg;)V
    .locals 0
    .param p1, "matMsg"    # Lcom/scannerfire/model/MatMsg;

    .prologue
    .line 42
    iput-object p1, p0, Lcom/scannerfire/model/ListenerObjects;->matMsg:Lcom/scannerfire/model/MatMsg;

    .line 43
    return-void
.end method

.method public setMsg(Lcom/scannerfire/model/Mail;)V
    .locals 0
    .param p1, "msg"    # Lcom/scannerfire/model/Mail;

    .prologue
    .line 50
    iput-object p1, p0, Lcom/scannerfire/model/ListenerObjects;->msg:Lcom/scannerfire/model/Mail;

    .line 51
    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0
    .param p1, "value"    # Ljava/lang/String;

    .prologue
    .line 58
    iput-object p1, p0, Lcom/scannerfire/model/ListenerObjects;->value:Ljava/lang/String;

    .line 59
    return-void
.end method
