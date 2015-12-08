.class public Lcom/googlecode/flickrjandroid/auth/Permission;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final DELETE:Lcom/googlecode/flickrjandroid/auth/Permission;

.field public static final DELETE_TYPE:I = 0x3

.field public static final NONE:Lcom/googlecode/flickrjandroid/auth/Permission;

.field public static final NONE_TYPE:I = 0x0

.field public static final READ:Lcom/googlecode/flickrjandroid/auth/Permission;

.field public static final READ_TYPE:I = 0x1

.field public static final WRITE:Lcom/googlecode/flickrjandroid/auth/Permission;

.field public static final WRITE_TYPE:I = 0x2

.field private static final serialVersionUID:J = -0x4ab97316939bdb51L

.field private static final stringToPermissionMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/googlecode/flickrjandroid/auth/Permission;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private type:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 49
    new-instance v0, Lcom/googlecode/flickrjandroid/auth/Permission;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/googlecode/flickrjandroid/auth/Permission;-><init>(I)V

    sput-object v0, Lcom/googlecode/flickrjandroid/auth/Permission;->NONE:Lcom/googlecode/flickrjandroid/auth/Permission;

    .line 55
    new-instance v0, Lcom/googlecode/flickrjandroid/auth/Permission;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/googlecode/flickrjandroid/auth/Permission;-><init>(I)V

    sput-object v0, Lcom/googlecode/flickrjandroid/auth/Permission;->READ:Lcom/googlecode/flickrjandroid/auth/Permission;

    .line 61
    new-instance v0, Lcom/googlecode/flickrjandroid/auth/Permission;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lcom/googlecode/flickrjandroid/auth/Permission;-><init>(I)V

    sput-object v0, Lcom/googlecode/flickrjandroid/auth/Permission;->WRITE:Lcom/googlecode/flickrjandroid/auth/Permission;

    .line 66
    new-instance v0, Lcom/googlecode/flickrjandroid/auth/Permission;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/googlecode/flickrjandroid/auth/Permission;-><init>(I)V

    sput-object v0, Lcom/googlecode/flickrjandroid/auth/Permission;->DELETE:Lcom/googlecode/flickrjandroid/auth/Permission;

    .line 68
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 70
    sput-object v0, Lcom/googlecode/flickrjandroid/auth/Permission;->stringToPermissionMap:Ljava/util/Map;

    const-string v1, "none"

    sget-object v2, Lcom/googlecode/flickrjandroid/auth/Permission;->NONE:Lcom/googlecode/flickrjandroid/auth/Permission;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    sget-object v0, Lcom/googlecode/flickrjandroid/auth/Permission;->stringToPermissionMap:Ljava/util/Map;

    const-string v1, "read"

    sget-object v2, Lcom/googlecode/flickrjandroid/auth/Permission;->READ:Lcom/googlecode/flickrjandroid/auth/Permission;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    sget-object v0, Lcom/googlecode/flickrjandroid/auth/Permission;->stringToPermissionMap:Ljava/util/Map;

    const-string v1, "write"

    sget-object v2, Lcom/googlecode/flickrjandroid/auth/Permission;->WRITE:Lcom/googlecode/flickrjandroid/auth/Permission;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    sget-object v0, Lcom/googlecode/flickrjandroid/auth/Permission;->stringToPermissionMap:Ljava/util/Map;

    const-string v1, "delete"

    sget-object v2, Lcom/googlecode/flickrjandroid/auth/Permission;->DELETE:Lcom/googlecode/flickrjandroid/auth/Permission;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    return-void
.end method

.method private constructor <init>(I)V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput p1, p0, Lcom/googlecode/flickrjandroid/auth/Permission;->type:I

    .line 80
    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/googlecode/flickrjandroid/auth/Permission;
    .locals 2

    .prologue
    .line 93
    sget-object v0, Lcom/googlecode/flickrjandroid/auth/Permission;->stringToPermissionMap:Ljava/util/Map;

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/googlecode/flickrjandroid/auth/Permission;

    return-object v0
.end method


# virtual methods
.method public getType()I
    .locals 1

    .prologue
    .line 83
    iget v0, p0, Lcom/googlecode/flickrjandroid/auth/Permission;->type:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 97
    iget v0, p0, Lcom/googlecode/flickrjandroid/auth/Permission;->type:I

    packed-switch v0, :pswitch_data_0

    .line 103
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/googlecode/flickrjandroid/auth/Permission;->type:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 98
    :pswitch_0
    const-string v0, "none"

    .line 101
    :goto_0
    return-object v0

    .line 99
    :pswitch_1
    const-string v0, "read"

    goto :goto_0

    .line 100
    :pswitch_2
    const-string v0, "write"

    goto :goto_0

    .line 101
    :pswitch_3
    const-string v0, "delete"

    goto :goto_0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
