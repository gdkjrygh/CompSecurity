.class Lcom/scannerfire/model/ListenerObjects$5;
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
    iput-object p1, p0, Lcom/scannerfire/model/ListenerObjects$5;->this$0:Lcom/scannerfire/model/ListenerObjects;

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 160
    iget-object v4, p0, Lcom/scannerfire/model/ListenerObjects$5;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v4, v4, Lcom/scannerfire/model/ListenerObjects;->value:Ljava/lang/String;

    if-eqz v4, :cond_a

    .line 162
    iget-object v4, p0, Lcom/scannerfire/model/ListenerObjects$5;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v3, v4, Lcom/scannerfire/model/ListenerObjects;->value:Ljava/lang/String;

    .line 163
    .local v3, "text":Ljava/lang/String;
    const-string v4, "MECARD"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 165
    const-string v4, ""

    const-string v5, "MECARD"

    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 167
    new-instance v1, Landroid/content/Intent;

    const-string v4, "android.intent.action.INSERT"

    invoke-direct {v1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 169
    .local v1, "intent":Landroid/content/Intent;
    const-string v4, "vnd.android.cursor.dir/raw_contact"

    invoke-virtual {v1, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 170
    const-string v4, "(;)|(:)"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 171
    .local v2, "split":[Ljava/lang/String;
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    array-length v4, v2

    if-lt v0, v4, :cond_1

    .line 192
    iget-object v4, p0, Lcom/scannerfire/model/ListenerObjects$5;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v4, v4, Lcom/scannerfire/model/ListenerObjects;->context:Landroid/app/Activity;

    invoke-virtual {v4, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 240
    .end local v0    # "i":I
    .end local v1    # "intent":Landroid/content/Intent;
    .end local v2    # "split":[Ljava/lang/String;
    .end local v3    # "text":Ljava/lang/String;
    :cond_0
    :goto_1
    return-void

    .line 172
    .restart local v0    # "i":I
    .restart local v1    # "intent":Landroid/content/Intent;
    .restart local v2    # "split":[Ljava/lang/String;
    .restart local v3    # "text":Ljava/lang/String;
    :cond_1
    const-string v4, ""

    new-instance v5, Ljava/lang/StringBuilder;

    aget-object v6, v2, v0

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, "\n"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    aget-object v4, v2, v0

    const-string v5, "N"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 175
    const-string v4, "name"

    add-int/lit8 v5, v0, 0x1

    aget-object v5, v2, v5

    invoke-virtual {v1, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 178
    :cond_2
    aget-object v4, v2, v0

    const-string v5, "TEL"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 180
    const-string v4, "phone"

    add-int/lit8 v5, v0, 0x1

    aget-object v5, v2, v5

    invoke-virtual {v1, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 184
    :cond_3
    aget-object v4, v2, v0

    const-string v5, "EMAIL"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 186
    const-string v4, "email"

    add-int/lit8 v5, v0, 0x1

    aget-object v5, v2, v5

    invoke-virtual {v1, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 171
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 196
    .end local v0    # "i":I
    .end local v1    # "intent":Landroid/content/Intent;
    .end local v2    # "split":[Ljava/lang/String;
    :cond_5
    const-string v4, "BEGIN:VCARD"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 198
    const-string v4, ""

    const-string v5, "VCARD"

    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 200
    new-instance v1, Landroid/content/Intent;

    const-string v4, "android.intent.action.INSERT"

    invoke-direct {v1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 202
    .restart local v1    # "intent":Landroid/content/Intent;
    const-string v4, "vnd.android.cursor.dir/raw_contact"

    invoke-virtual {v1, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 203
    const-string v4, "\n|(:)"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 204
    .restart local v2    # "split":[Ljava/lang/String;
    const/4 v0, 0x0

    .restart local v0    # "i":I
    :goto_2
    array-length v4, v2

    if-lt v0, v4, :cond_6

    .line 225
    iget-object v4, p0, Lcom/scannerfire/model/ListenerObjects$5;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v4, v4, Lcom/scannerfire/model/ListenerObjects;->context:Landroid/app/Activity;

    invoke-virtual {v4, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_1

    .line 205
    :cond_6
    const-string v4, ""

    new-instance v5, Ljava/lang/StringBuilder;

    aget-object v6, v2, v0

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, "\n"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    aget-object v4, v2, v0

    const-string v5, "N"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 208
    const-string v4, "name"

    add-int/lit8 v5, v0, 0x1

    aget-object v5, v2, v5

    invoke-virtual {v1, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 211
    :cond_7
    aget-object v4, v2, v0

    const-string v5, "TEL"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 213
    const-string v4, "phone"

    add-int/lit8 v5, v0, 0x1

    aget-object v5, v2, v5

    invoke-virtual {v1, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 217
    :cond_8
    aget-object v4, v2, v0

    const-string v5, "EMAIL"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_9

    .line 219
    const-string v4, "email"

    add-int/lit8 v5, v0, 0x1

    aget-object v5, v2, v5

    invoke-virtual {v1, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 204
    :cond_9
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 234
    .end local v0    # "i":I
    .end local v1    # "intent":Landroid/content/Intent;
    .end local v2    # "split":[Ljava/lang/String;
    .end local v3    # "text":Ljava/lang/String;
    :cond_a
    new-instance v1, Landroid/content/Intent;

    const-string v4, "android.intent.action.INSERT"

    invoke-direct {v1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 235
    .restart local v1    # "intent":Landroid/content/Intent;
    const-string v4, "vnd.android.cursor.dir/contact"

    invoke-virtual {v1, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 236
    const-string v4, "phone"

    invoke-static {}, Lcom/scannerfire/model/BizCard;->getB()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 237
    const-string v4, "name"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/scannerfire/model/BizCard;->getN()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    const-string v6, " "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lcom/scannerfire/model/BizCard;->getX()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 237
    invoke-virtual {v1, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 239
    iget-object v4, p0, Lcom/scannerfire/model/ListenerObjects$5;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v4, v4, Lcom/scannerfire/model/ListenerObjects;->context:Landroid/app/Activity;

    invoke-virtual {v4, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_1
.end method
