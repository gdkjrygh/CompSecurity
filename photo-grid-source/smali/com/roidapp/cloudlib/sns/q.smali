.class public final Lcom/roidapp/cloudlib/sns/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final A:Ljava/lang/String;

.field private static final B:Ljava/lang/String;

.field private static final C:Ljava/lang/String;

.field private static final D:Ljava/lang/String;

.field private static final E:Ljava/lang/String;

.field private static final F:Ljava/lang/String;

.field private static final G:Ljava/lang/String;

.field private static final H:Ljava/lang/String;

.field private static final I:Ljava/lang/String;

.field private static final J:Ljava/lang/String;

.field private static final K:Ljava/lang/String;

.field private static final L:Ljava/lang/String;

.field private static final M:Ljava/lang/String;

.field private static final N:Ljava/lang/String;

.field private static final O:Ljava/lang/String;

.field private static final P:Ljava/lang/String;

.field private static final a:Ljava/lang/String;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static final d:Ljava/lang/String;

.field private static final e:Ljava/lang/String;

.field private static final f:Ljava/lang/String;

.field private static final g:Ljava/lang/String;

.field private static final h:Ljava/lang/String;

.field private static final i:Ljava/lang/String;

.field private static final j:Ljava/lang/String;

.field private static final k:Ljava/lang/String;

.field private static final l:Ljava/lang/String;

.field private static final m:Ljava/lang/String;

.field private static final n:Ljava/lang/String;

.field private static final o:Ljava/lang/String;

.field private static final p:Ljava/lang/String;

.field private static final q:Ljava/lang/String;

.field private static final r:Ljava/lang/String;

.field private static final s:Ljava/lang/String;

.field private static final t:Ljava/lang/String;

.field private static final u:Ljava/lang/String;

.field private static final v:Ljava/lang/String;

.field private static final w:Ljava/lang/String;

.field private static final x:Ljava/lang/String;

.field private static final y:Ljava/lang/String;

.field private static final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 40
    const-string v0, "http://api.adr.pt.ksmobile.com"

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    .line 45
    invoke-static {}, Lcom/roidapp/cloudlib/sns/af;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "http://d1n0nt1uck27u7.cloudfront.net/area/us"

    :goto_0
    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->b:Ljava/lang/String;

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/msg/get"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->c:Ljava/lang/String;

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/like/delset"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->d:Ljava/lang/String;

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/like/set"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->e:Ljava/lang/String;

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/like/getList"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->f:Ljava/lang/String;

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/comment/del"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->g:Ljava/lang/String;

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/comment/create"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->h:Ljava/lang/String;

    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/comment/getList"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->i:Ljava/lang/String;

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/getUserHotList"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->j:Ljava/lang/String;

    .line 93
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/publicExplore"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->k:Ljava/lang/String;

    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/profile"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->l:Ljava/lang/String;

    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/unFollow"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->m:Ljava/lang/String;

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/follow"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->n:Ljava/lang/String;

    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/post/info"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->o:Ljava/lang/String;

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/post/delete"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->p:Ljava/lang/String;

    .line 123
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/post/imgCreate"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->q:Ljava/lang/String;

    .line 128
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/post"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->r:Ljava/lang/String;

    .line 133
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/newFeedLogin"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->s:Ljava/lang/String;

    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/getFansList"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->t:Ljava/lang/String;

    .line 143
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/getFollowList"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->u:Ljava/lang/String;

    .line 148
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/signout"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->v:Ljava/lang/String;

    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/signup"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->w:Ljava/lang/String;

    .line 158
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/otherPost"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->x:Ljava/lang/String;

    .line 163
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/updateProfile"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->y:Ljava/lang/String;

    .line 170
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/indexPic"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->z:Ljava/lang/String;

    .line 175
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/indexTag"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->A:Ljava/lang/String;

    .line 180
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/indexPost?page=%s&pagesize=%s"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->B:Ljava/lang/String;

    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/post/indexPost"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->C:Ljava/lang/String;

    .line 187
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/indexUser"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->D:Ljava/lang/String;

    .line 189
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/indexUser"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->E:Ljava/lang/String;

    .line 194
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/api/tagTop"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->F:Ljava/lang/String;

    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/tag/tagTop"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->G:Ljava/lang/String;

    .line 202
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/post/report"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->H:Ljava/lang/String;

    .line 207
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/api/shareTag"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->I:Ljava/lang/String;

    .line 212
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/comment/report"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->J:Ljava/lang/String;

    .line 217
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/searchName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->K:Ljava/lang/String;

    .line 222
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/tag/search"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->L:Ljava/lang/String;

    .line 227
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/postBynickName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->M:Ljava/lang/String;

    .line 233
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/updateAvatar"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->N:Ljava/lang/String;

    .line 243
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/newFeedNoLogin"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->O:Ljava/lang/String;

    .line 248
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/user/getFirendsFromThird"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/sns/q;->P:Ljava/lang/String;

    return-void

    .line 45
    :cond_0
    const-string v0, "http://d1n0nt1uck27u7.cloudfront.net/api"

    goto/16 :goto_0
.end method

.method public static a(IILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;"
        }
    .end annotation

    .prologue
    .line 999
    sget-object v0, Lcom/roidapp/cloudlib/sns/q;->B:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1000
    new-instance v1, Lcom/roidapp/cloudlib/sns/n;

    const-class v2, Lcom/roidapp/cloudlib/sns/b/a/e;

    new-instance v3, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v3, p2}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v1, v0, v2, v3}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 1002
    invoke-static {p0, v1}, Lcom/roidapp/cloudlib/sns/q;->a(ILcom/roidapp/cloudlib/sns/o;)V

    .line 1003
    return-object v1
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;ILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "I",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/p;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/p;",
            ">;"
        }
    .end annotation

    .prologue
    .line 269
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->w:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/p;

    new-instance v4, Lcom/roidapp/cloudlib/sns/r;

    invoke-direct {v4, p3, p0}, Lcom/roidapp/cloudlib/sns/r;-><init>(Lcom/roidapp/cloudlib/sns/w;Landroid/content/Context;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 277
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 278
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "accesstoken"

    invoke-direct {v2, v3, p1}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 279
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "type"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 280
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 281
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 282
    return-object v0
.end method

.method public static a(Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/f;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/f;",
            ">;"
        }
    .end annotation

    .prologue
    .line 975
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->A:Ljava/lang/String;

    const-class v2, Lcom/roidapp/cloudlib/sns/b/a/f;

    new-instance v3, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v3, p0}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;ILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/w;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/w;",
            ">;"
        }
    .end annotation

    .prologue
    .line 957
    new-instance v1, Lcom/roidapp/cloudlib/sns/n;

    sget-object v0, Lcom/roidapp/cloudlib/sns/q;->F:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/w;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p2}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 959
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 960
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "tag"

    invoke-direct {v2, v3, p0}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 961
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "minst"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 962
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "maxst"

    const-string v4, "0"

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 963
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pagesize"

    const-string v4, "20"

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 964
    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 965
    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 966
    return-object v1

    .line 965
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;J)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .prologue
    .line 294
    new-instance v0, Lcom/roidapp/cloudlib/sns/l;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->v:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    new-instance v3, Lcom/roidapp/cloudlib/sns/x;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/l;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Lcom/roidapp/baselib/e/j;)V

    .line 296
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 297
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 298
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 299
    return-object v0
.end method

.method public static a(Ljava/lang/String;JIILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JII",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1017
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->C:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/a/e;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p5}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 1019
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 1020
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "page"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1021
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pagesize"

    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1022
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 1023
    invoke-static {p3, v0}, Lcom/roidapp/cloudlib/sns/q;->a(ILcom/roidapp/cloudlib/sns/o;)V

    .line 1024
    return-object v0
.end method

.method public static a(Ljava/lang/String;JIJJLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JIJJ",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/a;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 738
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->i:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/a/a;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p8}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 740
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 741
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pid"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 742
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "limit"

    const-string v4, "20"

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 743
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "lastcid"

    invoke-static {p4, p5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 744
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "minst"

    invoke-static {p6, p7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 745
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 746
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 747
    return-object v0
.end method

.method public static a(Ljava/lang/String;JIJLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JIJ",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lorg/json/JSONObject;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .prologue
    .line 808
    new-instance v0, Lcom/roidapp/cloudlib/sns/l;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->g:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    new-instance v3, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v3, p6}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/l;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Lcom/roidapp/baselib/e/j;)V

    .line 810
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 811
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pid"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 812
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "cid"

    invoke-static {p4, p5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 813
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 814
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 815
    return-object v0
.end method

.method public static a(Ljava/lang/String;JIJLjava/lang/String;Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JIJ",
            "Ljava/lang/String;",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lorg/json/JSONObject;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .prologue
    .line 831
    new-instance v0, Lcom/roidapp/cloudlib/sns/l;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->J:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    new-instance v3, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v3, p7}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/l;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Lcom/roidapp/baselib/e/j;)V

    .line 833
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 834
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pid"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 835
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "cid"

    invoke-static {p4, p5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 836
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "content"

    invoke-direct {v2, v3, p6}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 837
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 838
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 839
    return-object v0
.end method

.method public static a(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JI",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/b;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 364
    invoke-static {p3}, Lcom/roidapp/cloudlib/sns/q;->a(I)V

    .line 365
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->u:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/a/b;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p4}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 367
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 368
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "page"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 369
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pagesize"

    const-string v4, "20"

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 370
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 371
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 372
    return-object v0
.end method

.method public static a(Ljava/lang/String;JILjava/lang/String;Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JI",
            "Ljava/lang/String;",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 762
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->h:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/a;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p5}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 764
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 765
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pid"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 766
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "content"

    invoke-direct {v2, v3, p4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 767
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 768
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 769
    return-object v0
.end method

.method public static a(Ljava/lang/String;JJILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJI",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;"
        }
    .end annotation

    .prologue
    .line 586
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->x:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/a/e;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p6}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 588
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 589
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "userid"

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 590
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "page"

    invoke-static {p5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 591
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pagesize"

    const-string v4, "10"

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 592
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 593
    invoke-static {p5, v0}, Lcom/roidapp/cloudlib/sns/q;->a(ILcom/roidapp/cloudlib/sns/o;)V

    .line 594
    return-object v0
.end method

.method public static a(Ljava/lang/String;JJLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJ",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lorg/json/JSONObject;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .prologue
    .line 496
    new-instance v0, Lcom/roidapp/cloudlib/sns/l;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->n:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    new-instance v3, Lcom/roidapp/cloudlib/sns/s;

    invoke-direct {v3, p5}, Lcom/roidapp/cloudlib/sns/s;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/l;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Lcom/roidapp/baselib/e/j;)V

    .line 507
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 508
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "toid"

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 509
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 510
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 511
    return-object v0
.end method

.method public static a(Ljava/lang/String;JLandroid/os/Bundle;Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Landroid/os/Bundle;",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lorg/json/JSONObject;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .prologue
    .line 313
    new-instance v0, Lcom/roidapp/cloudlib/sns/l;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->y:Ljava/lang/String;

    new-instance v2, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v2, p4}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/l;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/j;)V

    .line 315
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 322
    const-string v2, "nickname"

    invoke-virtual {p3, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 323
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 324
    new-instance v3, Lcom/roidapp/baselib/e/k;

    const-string v4, "nickname"

    invoke-direct {v3, v4, v2}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 328
    :cond_0
    const-string v2, "email"

    invoke-virtual {p3, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 329
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 330
    new-instance v3, Lcom/roidapp/baselib/e/k;

    const-string v4, "email"

    invoke-direct {v3, v4, v2}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 333
    :cond_1
    const-string v2, "gender"

    invoke-virtual {p3, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 334
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 335
    new-instance v3, Lcom/roidapp/baselib/e/k;

    const-string v4, "gender"

    invoke-direct {v3, v4, v2}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 338
    :cond_2
    const-string v2, "birthday"

    invoke-virtual {p3, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 339
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    .line 340
    new-instance v3, Lcom/roidapp/baselib/e/k;

    const-string v4, "birthday"

    invoke-direct {v3, v4, v2}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 349
    :cond_3
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 350
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 351
    return-object v0
.end method

.method public static a(Ljava/lang/String;JLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/c;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/c;",
            ">;"
        }
    .end annotation

    .prologue
    .line 915
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->c:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/a/c;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p3}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 917
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 918
    return-object v0
.end method

.method public static a(Ljava/lang/String;JLjava/lang/String;ILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "I",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;"
        }
    .end annotation

    .prologue
    .line 609
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->M:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/a/e;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p5}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 611
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 612
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "nickname"

    invoke-direct {v2, v3, p3}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 613
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "page"

    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 614
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pagesize"

    const-string v4, "10"

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 615
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 616
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 617
    return-object v0
.end method

.method public static a(Ljava/lang/String;JLjava/lang/String;Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/d;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/d;",
            ">;"
        }
    .end annotation

    .prologue
    .line 674
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->P:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/a/d;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p4}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 676
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 677
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "uidstr"

    invoke-direct {v2, v3, p3}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 678
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "type"

    const-string v4, "1"

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 679
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 680
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 681
    return-object v0
.end method

.method public static a(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/cloudlib/sns/w;ILcom/roidapp/baselib/e/d;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lorg/json/JSONObject;",
            ">;I",
            "Lcom/roidapp/baselib/e/d;",
            ")",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .prologue
    .line 451
    new-instance v0, Lcom/roidapp/cloudlib/sns/l;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->q:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    new-instance v3, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v3, p7}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/l;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Lcom/roidapp/baselib/e/j;)V

    .line 453
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 454
    new-instance v2, Lcom/roidapp/baselib/e/c;

    const-string v3, "file"

    invoke-direct {v2, v3, p3, p4, p9}, Lcom/roidapp/baselib/e/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/baselib/e/d;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 455
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "content"

    invoke-direct {v2, v3, p6}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 456
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 457
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "tag"

    invoke-direct {v2, v3, p5}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 459
    :cond_0
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 460
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 461
    invoke-virtual {v0, p8}, Lcom/roidapp/cloudlib/sns/o;->a(I)V

    .line 462
    return-object v0
.end method

.method public static a(Ljava/lang/String;JZLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JZ",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/d;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/d;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1047
    new-instance v1, Lcom/roidapp/cloudlib/sns/n;

    sget-object v0, Lcom/roidapp/cloudlib/sns/q;->E:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/a/d;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p4}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 1049
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v2

    .line 1050
    new-instance v3, Lcom/roidapp/baselib/e/k;

    const-string v4, "official"

    if-eqz p3, :cond_0

    const-string v0, "1"

    :goto_0
    invoke-direct {v3, v4, v0}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1051
    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/sns/n;->a(Ljava/lang/Iterable;)V

    .line 1052
    return-object v1

    .line 1050
    :cond_0
    const-string v0, "0"

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/g;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/g;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1094
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->L:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/a/g;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p1}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 1096
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1097
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "tag"

    invoke-direct {v2, v3, p0}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1098
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 1099
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 1100
    return-object v0
.end method

.method public static a(ZLjava/lang/String;Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/h;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/h;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1080
    new-instance v1, Lcom/roidapp/cloudlib/sns/n;

    sget-object v0, Lcom/roidapp/cloudlib/sns/q;->K:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/a/h;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p2}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 1082
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1083
    new-instance v3, Lcom/roidapp/baselib/e/k;

    const-string v4, "isat"

    if-eqz p0, :cond_0

    const-string v0, "1"

    :goto_0
    invoke-direct {v3, v4, v0}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1084
    new-instance v0, Lcom/roidapp/baselib/e/k;

    const-string v3, "name"

    invoke-direct {v0, v3, p1}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1085
    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 1086
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 1087
    return-object v1

    .line 1083
    :cond_0
    const-string v0, "0"

    goto :goto_0
.end method

.method private static a(I)V
    .locals 2

    .prologue
    .line 1179
    if-gtz p0, :cond_0

    .line 1180
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "page cannot less than 1"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1182
    :cond_0
    return-void
.end method

.method private static a(ILcom/roidapp/cloudlib/sns/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/roidapp/cloudlib/sns/o",
            "<*>;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    .line 1185
    if-gt p0, v0, :cond_0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 1186
    return-void

    .line 1185
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/f;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/f;",
            ">;"
        }
    .end annotation

    .prologue
    .line 986
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->z:Ljava/lang/String;

    const-class v2, Lcom/roidapp/cloudlib/sns/b/a/f;

    new-instance v3, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v3, p0}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JI",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/b;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 385
    invoke-static {p3}, Lcom/roidapp/cloudlib/sns/q;->a(I)V

    .line 386
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->t:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/a/b;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p4}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 388
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 389
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "page"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 390
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pagesize"

    const-string v4, "20"

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 391
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 392
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 393
    return-object v0
.end method

.method public static b(Ljava/lang/String;JJILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJI",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/b;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 630
    invoke-static {p5}, Lcom/roidapp/cloudlib/sns/q;->a(I)V

    .line 631
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->u:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/a/b;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p6}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 633
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 634
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "page"

    invoke-static {p5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 635
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pagesize"

    const-string v4, "20"

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 636
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "userid"

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 637
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 638
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 639
    return-object v0
.end method

.method public static b(Ljava/lang/String;JJLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJ",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lorg/json/JSONObject;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .prologue
    .line 525
    new-instance v0, Lcom/roidapp/cloudlib/sns/l;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->m:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    new-instance v3, Lcom/roidapp/cloudlib/sns/t;

    invoke-direct {v3, p5}, Lcom/roidapp/cloudlib/sns/t;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/l;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Lcom/roidapp/baselib/e/j;)V

    .line 536
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 537
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "toid"

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 538
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 539
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 540
    return-object v0
.end method

.method public static b(Ljava/lang/String;JLjava/lang/String;ILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "I",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/w;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/w;",
            ">;"
        }
    .end annotation

    .prologue
    .line 933
    new-instance v1, Lcom/roidapp/cloudlib/sns/n;

    sget-object v0, Lcom/roidapp/cloudlib/sns/q;->G:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/w;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p5}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 935
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v0

    .line 936
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "tag"

    invoke-direct {v2, v3, p3}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 937
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "minst"

    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 938
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "maxst"

    const-string v4, "0"

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 939
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pagesize"

    const-string v4, "20"

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 940
    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 941
    if-nez p4, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 942
    return-object v1

    .line 941
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;JLjava/lang/String;Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/x;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/x;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1122
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->N:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/x;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p4}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 1124
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 1125
    new-instance v2, Lcom/roidapp/baselib/e/c;

    const-string v3, "image"

    const-string v4, "image/jpeg"

    const/4 v5, 0x0

    invoke-direct {v2, v3, p3, v4, v5}, Lcom/roidapp/baselib/e/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roidapp/baselib/e/d;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1126
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 1127
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 1128
    return-object v0
.end method

.method private static b(Ljava/lang/String;J)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J)",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/baselib/e/f;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1172
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1173
    new-instance v1, Lcom/roidapp/baselib/e/k;

    const-string v2, "token"

    invoke-direct {v1, v2, p0}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1174
    new-instance v1, Lcom/roidapp/baselib/e/k;

    const-string v2, "uid"

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1175
    return-object v0
.end method

.method public static c(Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/d;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/d;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1034
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->D:Ljava/lang/String;

    const-class v2, Lcom/roidapp/cloudlib/sns/b/a/d;

    new-instance v3, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v3, p0}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JI",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;"
        }
    .end annotation

    .prologue
    .line 405
    invoke-static {p3}, Lcom/roidapp/cloudlib/sns/q;->a(I)V

    .line 406
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->s:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/a/e;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p4}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 408
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 409
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "page"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 410
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pagesize"

    const-string v4, "10"

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 411
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 412
    invoke-static {p3, v0}, Lcom/roidapp/cloudlib/sns/q;->a(ILcom/roidapp/cloudlib/sns/o;)V

    .line 413
    return-object v0
.end method

.method public static c(Ljava/lang/String;JJILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJI",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/b;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 652
    invoke-static {p5}, Lcom/roidapp/cloudlib/sns/q;->a(I)V

    .line 653
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->t:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/a/b;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p6}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 655
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 656
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "page"

    invoke-static {p5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 657
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pagesize"

    const-string v4, "20"

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 658
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "userid"

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 659
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 660
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 661
    return-object v0
.end method

.method public static c(Ljava/lang/String;JJLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJ",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/x;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/x;",
            ">;"
        }
    .end annotation

    .prologue
    .line 553
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->l:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/x;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p5}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 555
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 556
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "userid"

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 557
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 558
    return-object v0
.end method

.method public static d(Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/f;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/f;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1108
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->I:Ljava/lang/String;

    const-class v2, Lcom/roidapp/cloudlib/sns/b/a/f;

    new-instance v3, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v3, p0}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    return-object v0
.end method

.method public static d(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JI",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/n;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/n;",
            ">;"
        }
    .end annotation

    .prologue
    .line 426
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->o:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    const-class v3, Lcom/roidapp/cloudlib/sns/b/n;

    new-instance v4, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v4, p4}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    .line 428
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 429
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pid"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 430
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 431
    return-object v0
.end method

.method public static e(Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1152
    new-instance v0, Lcom/roidapp/cloudlib/sns/n;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->O:Ljava/lang/String;

    const-class v2, Lcom/roidapp/cloudlib/sns/b/a/e;

    new-instance v3, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v3, p0}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/n;-><init>(Ljava/lang/String;Ljava/lang/Class;Lcom/roidapp/baselib/e/j;)V

    return-object v0
.end method

.method public static e(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JI",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lorg/json/JSONObject;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .prologue
    .line 476
    new-instance v0, Lcom/roidapp/cloudlib/sns/l;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->p:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    new-instance v3, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v3, p4}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/l;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Lcom/roidapp/baselib/e/j;)V

    .line 478
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 479
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pid"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 480
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 481
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 482
    return-object v0
.end method

.method public static f(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JI",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/a/e;",
            ">;"
        }
    .end annotation

    .prologue
    .line 571
    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p1

    move v6, p3

    move-object v7, p4

    invoke-static/range {v1 .. v7}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JJILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    return-object v0
.end method

.method public static g(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JI",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lorg/json/JSONObject;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .prologue
    .line 876
    new-instance v0, Lcom/roidapp/cloudlib/sns/l;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->e:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    new-instance v3, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v3, p4}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/l;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Lcom/roidapp/baselib/e/j;)V

    .line 878
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 879
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pid"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 880
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "xaid"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "xaid:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/roidapp/baselib/d/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 881
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 882
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 883
    return-object v0
.end method

.method public static h(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JI",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lorg/json/JSONObject;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .prologue
    .line 896
    new-instance v0, Lcom/roidapp/cloudlib/sns/l;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->d:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    new-instance v3, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v3, p4}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/l;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Lcom/roidapp/baselib/e/j;)V

    .line 898
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 899
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pid"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 900
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "xaid"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "xaid:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/roidapp/baselib/d/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 901
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 902
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 903
    return-object v0
.end method

.method public static i(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JI",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Lorg/json/JSONObject;",
            ">;)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1064
    new-instance v0, Lcom/roidapp/cloudlib/sns/l;

    sget-object v1, Lcom/roidapp/cloudlib/sns/q;->H:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    new-instance v3, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v3, p4}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/sns/l;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Lcom/roidapp/baselib/e/j;)V

    .line 1066
    invoke-static {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;J)Ljava/util/List;

    move-result-object v1

    .line 1067
    new-instance v2, Lcom/roidapp/baselib/e/k;

    const-string v3, "pid"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/e/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1068
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Iterable;)V

    .line 1069
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 1070
    return-object v0
.end method
