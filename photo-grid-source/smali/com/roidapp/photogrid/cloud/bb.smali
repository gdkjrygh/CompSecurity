.class final Lcom/roidapp/photogrid/cloud/bb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public a:Z

.field final synthetic b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V
    .locals 1

    .prologue
    .line 1037
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1039
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/bb;->a:Z

    .line 1040
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    .line 1041
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/cloud/bb;->d:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;B)V
    .locals 0

    .prologue
    .line 1037
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/cloud/bb;-><init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 1045
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/bb;->a:Z

    .line 1046
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    .line 1047
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/cloud/bb;->d:I

    .line 1048
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->q(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1049
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->d()Z

    .line 1050
    return-void
.end method

.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .prologue
    .line 1149
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/c/n;->c(Ljava/lang/String;)Z

    move-result v0

    .line 1150
    if-eqz v0, :cond_0

    .line 1151
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070188

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " 30"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->b(Ljava/lang/String;)V

    .line 1152
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 1153
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/EditText;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->r(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Lcom/roidapp/photogrid/cloud/bb;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1154
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    iget v2, p0, Lcom/roidapp/photogrid/cloud/bb;->e:I

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v1, v2, v0}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 1155
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/EditText;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->r(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Lcom/roidapp/photogrid/cloud/bb;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1157
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->b(Lcom/roidapp/photogrid/cloud/PGShareActivity;Ljava/lang/String;)V

    .line 1158
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    .prologue
    .line 1054
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/bb;->e:I

    .line 1055
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1f4

    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v2, -0x1

    const/16 v3, 0x3e9

    .line 1059
    iget v0, p0, Lcom/roidapp/photogrid/cloud/bb;->d:I

    if-ne v0, v2, :cond_0

    .line 1060
    iput p2, p0, Lcom/roidapp/photogrid/cloud/bb;->d:I

    .line 1063
    :cond_0
    if-lez p4, :cond_8

    .line 1064
    add-int v0, p2, p4

    invoke-interface {p1, p2, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1065
    iget-boolean v1, p0, Lcom/roidapp/photogrid/cloud/bb;->a:Z

    if-eqz v1, :cond_7

    .line 1066
    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1067
    iput-boolean v4, p0, Lcom/roidapp/photogrid/cloud/bb;->a:Z

    .line 1068
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    .line 1069
    iput v2, p0, Lcom/roidapp/photogrid/cloud/bb;->d:I

    .line 1070
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->q(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 1071
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->d()Z

    .line 1145
    :cond_1
    :goto_0
    return-void

    .line 1074
    :cond_2
    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1075
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    .line 1076
    iput v2, p0, Lcom/roidapp/photogrid/cloud/bb;->d:I

    .line 1077
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->q(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    goto :goto_0

    .line 1080
    :cond_3
    if-ne p4, v5, :cond_5

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    .line 1081
    if-le p3, v5, :cond_4

    .line 1082
    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    .line 1098
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ltz v0, :cond_1

    .line 1099
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1100
    iput v3, v0, Landroid/os/Message;->what:I

    .line 1101
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1102
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->q(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 1103
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->q(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0, v6, v7}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 1084
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    goto :goto_1

    .line 1087
    :cond_5
    if-nez p3, :cond_6

    .line 1088
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    goto :goto_1

    .line 1090
    :cond_6
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1091
    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    goto :goto_1

    .line 1106
    :cond_7
    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1107
    iput-boolean v5, p0, Lcom/roidapp/photogrid/cloud/bb;->a:Z

    .line 1108
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    .line 1109
    iput p2, p0, Lcom/roidapp/photogrid/cloud/bb;->d:I

    goto/16 :goto_0

    .line 1114
    :cond_8
    iget v0, p0, Lcom/roidapp/photogrid/cloud/bb;->d:I

    if-ne v0, p2, :cond_9

    .line 1115
    iput-boolean v4, p0, Lcom/roidapp/photogrid/cloud/bb;->a:Z

    .line 1116
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    .line 1117
    iput v2, p0, Lcom/roidapp/photogrid/cloud/bb;->d:I

    .line 1118
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->q(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 1119
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->d()Z

    goto/16 :goto_0

    .line 1122
    :cond_9
    iget v0, p0, Lcom/roidapp/photogrid/cloud/bb;->d:I

    add-int/lit8 v0, v0, 0x1

    if-le v0, p2, :cond_a

    .line 1123
    iput-boolean v4, p0, Lcom/roidapp/photogrid/cloud/bb;->a:Z

    .line 1124
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    .line 1125
    iput v2, p0, Lcom/roidapp/photogrid/cloud/bb;->d:I

    .line 1126
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->q(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 1127
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->d()Z

    goto/16 :goto_0

    .line 1130
    :cond_a
    iget v0, p0, Lcom/roidapp/photogrid/cloud/bb;->d:I

    add-int/lit8 v0, v0, 0x1

    invoke-interface {p1, v0, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1131
    iget-boolean v1, p0, Lcom/roidapp/photogrid/cloud/bb;->a:Z

    if-eqz v1, :cond_1

    .line 1132
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 1133
    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    .line 1135
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ltz v0, :cond_1

    .line 1136
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1137
    iput v3, v0, Landroid/os/Message;->what:I

    .line 1138
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bb;->c:Ljava/lang/String;

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1139
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->q(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 1140
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bb;->b:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->q(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0, v6, v7}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto/16 :goto_0
.end method
