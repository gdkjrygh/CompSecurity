.class public final Lcom/kik/o/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Lcom/c/b/ak$a;

.field static b:Lcom/c/b/as$g;

.field static c:Lcom/c/b/ak$a;

.field static d:Lcom/c/b/as$g;

.field static e:Lcom/c/b/ak$a;

.field static f:Lcom/c/b/as$g;

.field static g:Lcom/c/b/ak$a;

.field static h:Lcom/c/b/as$g;

.field static i:Lcom/c/b/ak$a;

.field static j:Lcom/c/b/as$g;

.field static k:Lcom/c/b/ak$a;

.field static l:Lcom/c/b/as$g;

.field static m:Lcom/c/b/ak$a;

.field static n:Lcom/c/b/as$g;

.field static o:Lcom/c/b/ak$a;

.field static p:Lcom/c/b/as$g;

.field static q:Lcom/c/b/ak$a;

.field static r:Lcom/c/b/as$g;

.field private static s:Lcom/c/b/ak$g;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 64
    new-array v0, v6, [Ljava/lang/String;

    const-string v1, "\n\u0012common_model.proto\u0012\u0006common\u001a\u0019protobuf_validation.proto\"\"\n\u0006XiUuid\u0012\u000b\n\u0003msb\u0018\u0001 \u0001(\u0010\u0012\u000b\n\u0003lsb\u0018\u0002 \u0001(\u0010\"M\n\rXiBareUserJid\u0012<\n\nlocal_part\u0018\u0001 \u0001(\tB(\u00ca\u009d%$\u0008\u0001\u0012 ^[\\w\\.]{2,30}(_[A-Za-z0-9]{3})?$\"N\n\tXiUserJid\u0012/\n\u0008bare_jid\u0018\u0001 \u0001(\u000b2\u0015.common.XiBareUserJidB\u0006\u00ca\u009d%\u0002\u0008\u0001\u0012\u0010\n\u0008resource\u0018\u0002 \u0001(\t\"\u001e\n\nXiUsername\u0012\u0010\n\u0008username\u0018\u0001 \u0001(\t\",\n\u0005XiUid\u0012#\n\u0003uid\u0018\u0001 \u0001(\u0004B\u0016\u00ca\u009d%\u00129\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000A\u00ff\u00ff\u00ff\u00ff\u00ff\u0000\u0000\u0000\",\n\u0005XiGid\u0012#\n\u0003gid\u0018\u0001 \u0001(\u0004B\u0016\u00ca\u009d%\u00129\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000A\u00ff\u00ff\u00ff\u00ff\u00ff\u0001\u0000\u0000\"4\n\nXiGroupJid\u0012&\n\nlocal_pa"

    aput-object v1, v0, v4

    const-string v1, "rt\u0018\u0001 \u0001(\tB\u0012\u00ca\u009d%\u000e\u0008\u0001\u0012\n^\\d{13}_g$\"V\n\nXiUidOrGid\u0012\u001c\n\u0003uid\u0018\u0001 \u0001(\u000b2\r.common.XiUidH\u0000\u0012\u001c\n\u0003gid\u0018\u0002 \u0001(\u000b2\r.common.XiGidH\u0000B\u000c\n\nuid_or_gid\"\u007f\n\u0014XiBareUserOrGroupJid\u0012)\n\u0008user_jid\u0018\u0001 \u0001(\u000b2\u0015.common.XiBareUserJidH\u0000\u0012\'\n\tgroup_jid\u0018\u0002 \u0001(\u000b2\u0012.common.XiGroupJidH\u0000B\u0013\n\u0011user_or_group_jidB%\n\u000fcom.kik.ximodelB\u0010CommonModelProtoP\u0001b\u0006proto3"

    aput-object v1, v0, v5

    .line 84
    new-instance v1, Lcom/kik/o/b;

    invoke-direct {v1}, Lcom/kik/o/b;-><init>()V

    .line 92
    new-array v2, v5, [Lcom/c/b/ak$g;

    invoke-static {}, Lcom/kik/k/a;->a()Lcom/c/b/ak$g;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v0, v2, v1}, Lcom/c/b/ak$g;->a([Ljava/lang/String;[Lcom/c/b/ak$g;Lcom/c/b/ak$g$a;)V

    .line 97
    sget-object v0, Lcom/kik/o/a;->s:Lcom/c/b/ak$g;

    invoke-virtual {v0}, Lcom/c/b/ak$g;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$a;

    sput-object v0, Lcom/kik/o/a;->a:Lcom/c/b/ak$a;

    .line 99
    new-instance v0, Lcom/c/b/as$g;

    sget-object v1, Lcom/kik/o/a;->a:Lcom/c/b/ak$a;

    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "Msb"

    aput-object v3, v2, v4

    const-string v3, "Lsb"

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lcom/c/b/as$g;-><init>(Lcom/c/b/ak$a;[Ljava/lang/String;)V

    sput-object v0, Lcom/kik/o/a;->b:Lcom/c/b/as$g;

    .line 103
    sget-object v0, Lcom/kik/o/a;->s:Lcom/c/b/ak$g;

    invoke-virtual {v0}, Lcom/c/b/ak$g;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$a;

    sput-object v0, Lcom/kik/o/a;->c:Lcom/c/b/ak$a;

    .line 105
    new-instance v0, Lcom/c/b/as$g;

    sget-object v1, Lcom/kik/o/a;->c:Lcom/c/b/ak$a;

    new-array v2, v5, [Ljava/lang/String;

    const-string v3, "LocalPart"

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lcom/c/b/as$g;-><init>(Lcom/c/b/ak$a;[Ljava/lang/String;)V

    sput-object v0, Lcom/kik/o/a;->d:Lcom/c/b/as$g;

    .line 109
    sget-object v0, Lcom/kik/o/a;->s:Lcom/c/b/ak$g;

    invoke-virtual {v0}, Lcom/c/b/ak$g;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$a;

    sput-object v0, Lcom/kik/o/a;->e:Lcom/c/b/ak$a;

    .line 111
    new-instance v0, Lcom/c/b/as$g;

    sget-object v1, Lcom/kik/o/a;->e:Lcom/c/b/ak$a;

    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "BareJid"

    aput-object v3, v2, v4

    const-string v3, "Resource"

    aput-object v3, v2, v5

    invoke-direct {v0, v1, v2}, Lcom/c/b/as$g;-><init>(Lcom/c/b/ak$a;[Ljava/lang/String;)V

    sput-object v0, Lcom/kik/o/a;->f:Lcom/c/b/as$g;

    .line 115
    sget-object v0, Lcom/kik/o/a;->s:Lcom/c/b/ak$g;

    invoke-virtual {v0}, Lcom/c/b/ak$g;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$a;

    sput-object v0, Lcom/kik/o/a;->g:Lcom/c/b/ak$a;

    .line 117
    new-instance v0, Lcom/c/b/as$g;

    sget-object v1, Lcom/kik/o/a;->g:Lcom/c/b/ak$a;

    new-array v2, v5, [Ljava/lang/String;

    const-string v3, "Username"

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lcom/c/b/as$g;-><init>(Lcom/c/b/ak$a;[Ljava/lang/String;)V

    sput-object v0, Lcom/kik/o/a;->h:Lcom/c/b/as$g;

    .line 121
    sget-object v0, Lcom/kik/o/a;->s:Lcom/c/b/ak$g;

    invoke-virtual {v0}, Lcom/c/b/ak$g;->g()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$a;

    sput-object v0, Lcom/kik/o/a;->i:Lcom/c/b/ak$a;

    .line 123
    new-instance v0, Lcom/c/b/as$g;

    sget-object v1, Lcom/kik/o/a;->i:Lcom/c/b/ak$a;

    new-array v2, v5, [Ljava/lang/String;

    const-string v3, "Uid"

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lcom/c/b/as$g;-><init>(Lcom/c/b/ak$a;[Ljava/lang/String;)V

    sput-object v0, Lcom/kik/o/a;->j:Lcom/c/b/as$g;

    .line 127
    sget-object v0, Lcom/kik/o/a;->s:Lcom/c/b/ak$g;

    invoke-virtual {v0}, Lcom/c/b/ak$g;->g()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x5

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$a;

    sput-object v0, Lcom/kik/o/a;->k:Lcom/c/b/ak$a;

    .line 129
    new-instance v0, Lcom/c/b/as$g;

    sget-object v1, Lcom/kik/o/a;->k:Lcom/c/b/ak$a;

    new-array v2, v5, [Ljava/lang/String;

    const-string v3, "Gid"

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lcom/c/b/as$g;-><init>(Lcom/c/b/ak$a;[Ljava/lang/String;)V

    sput-object v0, Lcom/kik/o/a;->l:Lcom/c/b/as$g;

    .line 133
    sget-object v0, Lcom/kik/o/a;->s:Lcom/c/b/ak$g;

    invoke-virtual {v0}, Lcom/c/b/ak$g;->g()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$a;

    sput-object v0, Lcom/kik/o/a;->m:Lcom/c/b/ak$a;

    .line 135
    new-instance v0, Lcom/c/b/as$g;

    sget-object v1, Lcom/kik/o/a;->m:Lcom/c/b/ak$a;

    new-array v2, v5, [Ljava/lang/String;

    const-string v3, "LocalPart"

    aput-object v3, v2, v4

    invoke-direct {v0, v1, v2}, Lcom/c/b/as$g;-><init>(Lcom/c/b/ak$a;[Ljava/lang/String;)V

    sput-object v0, Lcom/kik/o/a;->n:Lcom/c/b/as$g;

    .line 139
    sget-object v0, Lcom/kik/o/a;->s:Lcom/c/b/ak$g;

    invoke-virtual {v0}, Lcom/c/b/ak$g;->g()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$a;

    sput-object v0, Lcom/kik/o/a;->o:Lcom/c/b/ak$a;

    .line 141
    new-instance v0, Lcom/c/b/as$g;

    sget-object v1, Lcom/kik/o/a;->o:Lcom/c/b/ak$a;

    new-array v2, v7, [Ljava/lang/String;

    const-string v3, "Uid"

    aput-object v3, v2, v4

    const-string v3, "Gid"

    aput-object v3, v2, v5

    const-string v3, "UidOrGid"

    aput-object v3, v2, v6

    invoke-direct {v0, v1, v2}, Lcom/c/b/as$g;-><init>(Lcom/c/b/ak$a;[Ljava/lang/String;)V

    sput-object v0, Lcom/kik/o/a;->p:Lcom/c/b/as$g;

    .line 145
    sget-object v0, Lcom/kik/o/a;->s:Lcom/c/b/ak$g;

    invoke-virtual {v0}, Lcom/c/b/ak$g;->g()Ljava/util/List;

    move-result-object v0

    const/16 v1, 0x8

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$a;

    sput-object v0, Lcom/kik/o/a;->q:Lcom/c/b/ak$a;

    .line 147
    new-instance v0, Lcom/c/b/as$g;

    sget-object v1, Lcom/kik/o/a;->q:Lcom/c/b/ak$a;

    new-array v2, v7, [Ljava/lang/String;

    const-string v3, "UserJid"

    aput-object v3, v2, v4

    const-string v3, "GroupJid"

    aput-object v3, v2, v5

    const-string v3, "UserOrGroupJid"

    aput-object v3, v2, v6

    invoke-direct {v0, v1, v2}, Lcom/c/b/as$g;-><init>(Lcom/c/b/ak$a;[Ljava/lang/String;)V

    sput-object v0, Lcom/kik/o/a;->r:Lcom/c/b/as$g;

    .line 151
    invoke-static {}, Lcom/c/b/ap;->a()Lcom/c/b/ap;

    move-result-object v0

    .line 153
    sget-object v1, Lcom/kik/k/a;->a:Lcom/c/b/as$h;

    invoke-virtual {v0, v1}, Lcom/c/b/ap;->a(Lcom/c/b/an;)V

    .line 154
    sget-object v1, Lcom/kik/o/a;->s:Lcom/c/b/ak$g;

    invoke-static {v1, v0}, Lcom/c/b/ak$g;->a(Lcom/c/b/ak$g;Lcom/c/b/ap;)V

    .line 156
    invoke-static {}, Lcom/kik/k/a;->a()Lcom/c/b/ak$g;

    .line 157
    return-void
.end method

.method public static a()Lcom/c/b/ak$g;
    .locals 1

    .prologue
    .line 59
    sget-object v0, Lcom/kik/o/a;->s:Lcom/c/b/ak$g;

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/ak$g;)Lcom/c/b/ak$g;
    .locals 0

    .prologue
    .line 6
    sput-object p0, Lcom/kik/o/a;->s:Lcom/c/b/ak$g;

    return-object p0
.end method
