.class public Lcom/facebook/orca/threadview/s;
.super Ljava/lang/Object;
.source "MessageListAdapter.java"

# interfaces
.implements Lcom/facebook/widget/animatablelistview/q;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/widget/animatablelistview/q",
        "<",
        "Lcom/facebook/orca/threadview/ac;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/orca/threadview/ac;

.field public static final b:Lcom/facebook/orca/threadview/ac;

.field public static final c:Lcom/facebook/orca/threadview/ac;


# instance fields
.field private final d:Landroid/content/Context;

.field private final e:Landroid/view/LayoutInflater;

.field private f:Lcom/facebook/orca/threadview/u;

.field private final g:Lcom/facebook/orca/threadview/r;

.field private h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 66
    new-instance v0, Lcom/facebook/orca/threadview/aj;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/facebook/orca/threadview/aj;-><init>(I)V

    sput-object v0, Lcom/facebook/orca/threadview/s;->a:Lcom/facebook/orca/threadview/ac;

    .line 68
    new-instance v0, Lcom/facebook/orca/threadview/aj;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lcom/facebook/orca/threadview/aj;-><init>(I)V

    sput-object v0, Lcom/facebook/orca/threadview/s;->b:Lcom/facebook/orca/threadview/ac;

    .line 70
    new-instance v0, Lcom/facebook/orca/threadview/aj;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/facebook/orca/threadview/aj;-><init>(I)V

    sput-object v0, Lcom/facebook/orca/threadview/s;->c:Lcom/facebook/orca/threadview/ac;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/LayoutInflater;)V
    .locals 1

    .prologue
    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/threadview/s;->h:Z

    .line 84
    iput-object p1, p0, Lcom/facebook/orca/threadview/s;->d:Landroid/content/Context;

    .line 85
    iput-object p2, p0, Lcom/facebook/orca/threadview/s;->e:Landroid/view/LayoutInflater;

    .line 87
    new-instance v0, Lcom/facebook/orca/threadview/t;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadview/t;-><init>(Lcom/facebook/orca/threadview/s;)V

    iput-object v0, p0, Lcom/facebook/orca/threadview/s;->g:Lcom/facebook/orca/threadview/r;

    .line 136
    return-void
.end method

.method private a(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 286
    .line 287
    if-nez p1, :cond_0

    .line 288
    iget-object v0, p0, Lcom/facebook/orca/threadview/s;->e:Landroid/view/LayoutInflater;

    sget v1, Lcom/facebook/k;->orca_load_more_placeholder_footer:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 290
    :cond_0
    return-object p1
.end method

.method private a(Lcom/facebook/orca/threadview/ac;Landroid/view/View;)Landroid/view/View;
    .locals 1

    .prologue
    .line 241
    check-cast p2, Lcom/facebook/orca/threadview/ReceiptItemView;

    .line 242
    if-nez p2, :cond_0

    .line 243
    new-instance p2, Lcom/facebook/orca/threadview/ReceiptItemView;

    iget-object v0, p0, Lcom/facebook/orca/threadview/s;->d:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/orca/threadview/ReceiptItemView;-><init>(Landroid/content/Context;)V

    .line 245
    :cond_0
    check-cast p1, Lcom/facebook/orca/threadview/ae;

    invoke-virtual {p2, p1}, Lcom/facebook/orca/threadview/ReceiptItemView;->setRowReceiptItem(Lcom/facebook/orca/threadview/ae;)V

    .line 246
    return-object p2
.end method

.method private a(Lcom/facebook/orca/threadview/ac;Landroid/view/View;Z)Landroid/view/View;
    .locals 1

    .prologue
    .line 263
    check-cast p2, Lcom/facebook/orca/threadview/l;

    .line 264
    if-nez p2, :cond_0

    .line 265
    new-instance p2, Lcom/facebook/orca/threadview/l;

    iget-object v0, p0, Lcom/facebook/orca/threadview/s;->d:Landroid/content/Context;

    invoke-direct {p2, v0, p3}, Lcom/facebook/orca/threadview/l;-><init>(Landroid/content/Context;Z)V

    .line 266
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/s;->h:Z

    invoke-virtual {p2, v0}, Lcom/facebook/orca/threadview/l;->setCanOpenMessagePermalink(Z)V

    .line 269
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/s;->g:Lcom/facebook/orca/threadview/r;

    invoke-virtual {p2, v0}, Lcom/facebook/orca/threadview/l;->setListener(Lcom/facebook/orca/threadview/r;)V

    .line 271
    check-cast p1, Lcom/facebook/orca/threadview/ad;

    .line 272
    invoke-virtual {p2, p1}, Lcom/facebook/orca/threadview/l;->setRowMessageItem(Lcom/facebook/orca/threadview/ad;)V

    .line 273
    return-object p2
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/s;)Lcom/facebook/orca/threadview/u;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/orca/threadview/s;->f:Lcom/facebook/orca/threadview/u;

    return-object v0
.end method

.method private b(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 294
    .line 295
    if-nez p1, :cond_0

    .line 296
    iget-object v0, p0, Lcom/facebook/orca/threadview/s;->e:Landroid/view/LayoutInflater;

    sget v1, Lcom/facebook/k;->orca_load_more_footer:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 298
    :cond_0
    return-object p1
.end method

.method private b(Lcom/facebook/orca/threadview/ac;Landroid/view/View;)Landroid/view/View;
    .locals 1

    .prologue
    .line 250
    check-cast p1, Lcom/facebook/orca/threadview/ai;

    .line 251
    check-cast p2, Lcom/facebook/orca/threadview/dp;

    .line 252
    if-nez p2, :cond_0

    .line 253
    new-instance p2, Lcom/facebook/orca/threadview/dp;

    iget-object v0, p0, Lcom/facebook/orca/threadview/s;->d:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/orca/threadview/dp;-><init>(Landroid/content/Context;)V

    .line 255
    :cond_0
    invoke-virtual {p2, p1}, Lcom/facebook/orca/threadview/dp;->setTypingItem(Lcom/facebook/orca/threadview/ai;)V

    .line 256
    return-object p2
.end method

.method private c(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 302
    .line 303
    if-nez p1, :cond_0

    .line 304
    iget-object v0, p0, Lcom/facebook/orca/threadview/s;->e:Landroid/view/LayoutInflater;

    sget v1, Lcom/facebook/k;->orca_loading_footer:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 306
    :cond_0
    return-object p1
.end method

.method private c(Lcom/facebook/orca/threadview/ac;Landroid/view/View;)Landroid/view/View;
    .locals 1

    .prologue
    .line 277
    check-cast p2, Lcom/facebook/orca/threadview/d;

    .line 278
    if-nez p2, :cond_0

    .line 279
    new-instance p2, Lcom/facebook/orca/threadview/d;

    iget-object v0, p0, Lcom/facebook/orca/threadview/s;->d:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/orca/threadview/d;-><init>(Landroid/content/Context;)V

    .line 281
    :cond_0
    check-cast p1, Lcom/facebook/orca/threadview/ad;

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/facebook/orca/threadview/d;->setMessage(Lcom/facebook/messages/model/threads/Message;)V

    .line 282
    return-object p2
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 140
    const/16 v0, 0x18

    return v0
.end method

.method public a(Lcom/facebook/orca/threadview/ac;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 200
    if-nez p1, :cond_0

    .line 201
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Null item"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 203
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ac;->a()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 237
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown object type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 205
    :pswitch_0
    invoke-direct {p0, p2, p3}, Lcom/facebook/orca/threadview/s;->a(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 235
    :goto_0
    return-object v0

    .line 207
    :pswitch_1
    invoke-direct {p0, p2, p3}, Lcom/facebook/orca/threadview/s;->b(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 209
    :pswitch_2
    invoke-direct {p0, p2, p3}, Lcom/facebook/orca/threadview/s;->c(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 219
    :pswitch_3
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/ac;Landroid/view/View;Z)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 229
    :pswitch_4
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/ac;Landroid/view/View;Z)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 231
    :pswitch_5
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/s;->c(Lcom/facebook/orca/threadview/ac;Landroid/view/View;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 233
    :pswitch_6
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/ac;Landroid/view/View;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 235
    :pswitch_7
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/s;->b(Lcom/facebook/orca/threadview/ac;Landroid/view/View;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_6
        :pswitch_7
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public bridge synthetic a(Ljava/lang/Object;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 21
    check-cast p1, Lcom/facebook/orca/threadview/ac;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/ac;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/orca/threadview/u;)V
    .locals 0

    .prologue
    .line 316
    iput-object p1, p0, Lcom/facebook/orca/threadview/s;->f:Lcom/facebook/orca/threadview/u;

    .line 317
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 320
    iput-boolean p1, p0, Lcom/facebook/orca/threadview/s;->h:Z

    .line 321
    return-void
.end method

.method public a(Lcom/facebook/orca/threadview/ac;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 166
    instance-of v2, p1, Lcom/facebook/orca/threadview/ad;

    if-eqz v2, :cond_2

    .line 167
    check-cast p1, Lcom/facebook/orca/threadview/ad;

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v2

    .line 168
    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->t()Z

    move-result v2

    if-nez v2, :cond_1

    .line 172
    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    .line 168
    goto :goto_0

    .line 169
    :cond_2
    sget-object v2, Lcom/facebook/orca/threadview/s;->b:Lcom/facebook/orca/threadview/ac;

    if-eq p1, v2, :cond_0

    move v0, v1

    .line 172
    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 21
    check-cast p1, Lcom/facebook/orca/threadview/ac;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadview/s;->a(Lcom/facebook/orca/threadview/ac;)Z

    move-result v0

    return v0
.end method

.method public b(Lcom/facebook/orca/threadview/ac;)J
    .locals 2

    .prologue
    .line 179
    sget-object v0, Lcom/facebook/orca/threadview/s;->a:Lcom/facebook/orca/threadview/ac;

    if-ne p1, v0, :cond_0

    .line 180
    const-wide/16 v0, 0x1

    .line 190
    :goto_0
    return-wide v0

    .line 181
    :cond_0
    sget-object v0, Lcom/facebook/orca/threadview/s;->b:Lcom/facebook/orca/threadview/ac;

    if-ne p1, v0, :cond_1

    .line 182
    const-wide/16 v0, 0x2

    goto :goto_0

    .line 183
    :cond_1
    sget-object v0, Lcom/facebook/orca/threadview/s;->c:Lcom/facebook/orca/threadview/ac;

    if-ne p1, v0, :cond_2

    .line 184
    const-wide/16 v0, 0x3

    goto :goto_0

    .line 185
    :cond_2
    instance-of v0, p1, Lcom/facebook/orca/threadview/ad;

    if-eqz v0, :cond_3

    .line 186
    check-cast p1, Lcom/facebook/orca/threadview/ad;

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->d(Ljava/lang/String;)J

    move-result-wide v0

    goto :goto_0

    .line 188
    :cond_3
    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)J
    .locals 2

    .prologue
    .line 21
    check-cast p1, Lcom/facebook/orca/threadview/ac;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadview/s;->b(Lcom/facebook/orca/threadview/ac;)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 158
    const/4 v0, 0x1

    return v0
.end method

.method public c(Lcom/facebook/orca/threadview/ac;)I
    .locals 1

    .prologue
    .line 195
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ac;->a()I

    move-result v0

    return v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 21
    check-cast p1, Lcom/facebook/orca/threadview/ac;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadview/s;->c(Lcom/facebook/orca/threadview/ac;)I

    move-result v0

    return v0
.end method
